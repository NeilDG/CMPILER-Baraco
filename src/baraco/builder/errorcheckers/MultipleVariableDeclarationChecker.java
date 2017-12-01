package baraco.builder.errorcheckers;

import baraco.antlr.parser.BaracoParser;
import baraco.builder.BuildChecker;
import baraco.builder.ErrorRepository;
import baraco.builder.ParserHandler;
import baraco.execution.ExecutionManager;
import baraco.representations.BaracoMethod;
import baraco.representations.BaracoValue;
import baraco.semantics.searching.VariableSearcher;
import baraco.semantics.symboltable.SymbolTableManager;
import baraco.semantics.symboltable.scopes.ClassScope;
import baraco.semantics.symboltable.scopes.LocalScopeCreator;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MultipleVariableDeclarationChecker implements IErrorChecker, ParseTreeListener{

    private BaracoParser.VariableDeclaratorIdContext varDecIdCtx;
    private int lineNumber;

    public MultipleVariableDeclarationChecker(BaracoParser.VariableDeclaratorIdContext varDecIdCtx) {
        this.varDecIdCtx = varDecIdCtx;

        Token firstToken = this.varDecIdCtx.getStart();
        this.lineNumber = firstToken.getLine();
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.builder.errorcheckers.IErrorChecker#verify()
     */
    @Override
    public void verify() {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.varDecIdCtx);
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
        if(ctx instanceof BaracoParser.VariableDeclaratorIdContext) {
            BaracoParser.VariableDeclaratorIdContext varDecCtx = (BaracoParser.VariableDeclaratorIdContext) ctx;
            this.verifyVariableOrConst(varDecCtx.getText());
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    private void verifyVariableOrConst(String identifierString) {
        BaracoValue baracoValue = null;

        if(ExecutionManager.getInstance().isInFunctionExecution()) {
            BaracoMethod baracoMethod = ExecutionManager.getInstance().getCurrentFunction();
            baracoValue = VariableSearcher.searchVariableInFunction(baracoMethod, identifierString);
        }

        //if after function finding, mobi value is still null, search local scope
        if(baracoValue == null) {
            baracoValue = LocalScopeCreator.searchVariableInLocalIterative(identifierString, LocalScopeCreator.getInstance().getActiveLocalScope());
        }

        //if mobi value is still null, search class
        if(baracoValue == null) {
            ClassScope classScope = SymbolTableManager.getInstance().getClassScope(ParserHandler.getInstance().getCurrentClassName());
            baracoValue = VariableSearcher.searchVariableInClass(classScope, identifierString);
        }


        if(baracoValue != null) {
            BuildChecker.reportCustomError(ErrorRepository.MULTIPLE_VARIABLE, "", identifierString, this.lineNumber);
        }
    }
}
