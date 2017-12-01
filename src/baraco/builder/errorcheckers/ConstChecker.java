package baraco.builder.errorcheckers;

import baraco.builder.BuildChecker;
import baraco.builder.ErrorRepository;
import baraco.builder.ParserHandler;
import baraco.execution.ExecutionManager;
import baraco.execution.commands.EvaluationCommand;
import baraco.representations.BaracoMethod;
import baraco.representations.BaracoValue;
import baraco.semantics.searching.VariableSearcher;
import baraco.semantics.symboltable.SymbolTableManager;
import baraco.semantics.symboltable.scopes.ClassScope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import baraco.antlr.parser.BaracoParser.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ConstChecker implements IErrorChecker, ParseTreeListener {
    private final static String TAG = "MobiProg_ConstChecker";

    private ExpressionContext exprCtx;
    private int lineNumber;

    public ConstChecker(ExpressionContext exprCtx) {
        this.exprCtx = exprCtx;

        Token firstToken = this.exprCtx.getStart();
        this.lineNumber = firstToken.getLine();
    }

    @Override
    public void verify() {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.exprCtx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if(ctx instanceof ExpressionContext) {
            ExpressionContext exprCtx = (ExpressionContext) ctx;
            if(EvaluationCommand.isVariableOrConst(exprCtx)) {
                this.verifyVariableOrConst(exprCtx);
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    private void verifyVariableOrConst(ExpressionContext varExprCtx) {
        BaracoValue baracoValue = null;

        if(ExecutionManager.getInstance().isInFunctionExecution()) {
            BaracoMethod baracoMethod = ExecutionManager.getInstance().getCurrentFunction();
            baracoValue = VariableSearcher.searchVariableInFunction(baracoMethod, varExprCtx.primary().Identifier().getText());
        }

        //if after function finding, mobi value is still null, search class
        if(baracoValue == null) {
            ClassScope classScope = SymbolTableManager.getInstance().getClassScope(ParserHandler.getInstance().getCurrentClassName());
            baracoValue = VariableSearcher.searchVariableInClassIncludingLocal(classScope, varExprCtx.primary().Identifier().getText());
        }

        if(baracoValue != null && baracoValue.isFinal()) {
            BuildChecker.reportCustomError(ErrorRepository.CONST_REASSIGNMENT, "", varExprCtx.getText(), this.lineNumber);
        }
    }

}
