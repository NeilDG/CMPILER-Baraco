package baraco.builder.errorcheckers;

import baraco.antlr.parser.BaracoParser;
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
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class UndeclaredChecker implements IErrorChecker, ParseTreeListener{

    private BaracoParser.ExpressionContext exprCtx;
    private String prevFunctionName = "";
    private int lineNumber;

    public UndeclaredChecker(BaracoParser.ExpressionContext exprCtx) {
        this.exprCtx = exprCtx;

        Token firstToken = this.exprCtx.getStart();
        this.lineNumber = firstToken.getLine();
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.builder.errorcheckers.IErrorChecker#verify()
     */
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
        if(ctx instanceof BaracoParser.ExpressionContext) {
            BaracoParser.ExpressionContext exprCtx = (BaracoParser.ExpressionContext) ctx;
            if(EvaluationCommand.isFunctionCall(exprCtx)) {
                System.out.println("FUNCTION ENTER " + ctx.getText());
                String s[] = exprCtx.getText().split("\\(");
                prevFunctionName = s[0];
                this.verifyFunctionCall(exprCtx);
            }
            else if(EvaluationCommand.isVariableOrConst(exprCtx)) {
                System.out.println("VARIABLE ENTER " + ctx.getText());
                if(!prevFunctionName.equals(exprCtx.getText()))
                    this.verifyVariableOrConst(exprCtx);
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    private void verifyFunctionCall(BaracoParser.ExpressionContext funcExprCtx) {

        //ThisKeywordChecker thisChecker = new ThisKeywordChecker(funcExprCtx.expression(0));
        //thisChecker.verify();

        if(funcExprCtx.expression(0) == null) {
            return;
        }

        String functionName = funcExprCtx.expression(0).getText();

        ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
                ParserHandler.getInstance().getCurrentClassName());
        BaracoMethod baracoMethod = classScope.searchMethod(functionName);

        if(baracoMethod == null) {
            BuildChecker.reportCustomError(ErrorRepository.UNDECLARED_FUNCTION, "", functionName, this.lineNumber);
        }
        else {
            //Console.log(LogType.DEBUG, "Function found: " +functionName);
        }
    }

    private void verifyVariableOrConst(BaracoParser.ExpressionContext varExprCtx) {
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

        //after second pass, we conclude if it cannot be found already
        if(baracoValue == null) {
            BuildChecker.reportCustomError(ErrorRepository.UNDECLARED_VARIABLE, "", varExprCtx.getText(), this.lineNumber);
        }
    }

    /*
     * Verifies a var or const identifier from a scan statement since scan grammar is different.
     */
    public static void verifyVarOrConstForScan(String identifier, BaracoParser.StatementContext statementCtx) {
        ClassScope classScope = SymbolTableManager.getInstance().getClassScope(ParserHandler.getInstance().getCurrentClassName());
        BaracoValue baracoValue = VariableSearcher.searchVariableInClassIncludingLocal(classScope, identifier);

        Token firstToken = statementCtx.getStart();

        if(baracoValue == null) {
            BuildChecker.reportCustomError(ErrorRepository.UNDECLARED_VARIABLE, "", identifier, firstToken.getLine());
        }
    }
}
