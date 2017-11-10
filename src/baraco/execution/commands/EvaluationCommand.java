package baraco.execution.commands;

import baraco.antlr.parser.BaracoParser.*;
import baraco.builder.ParserHandler;
import baraco.representations.BaracoMethod;
import baraco.representations.BaracoValue;
import baraco.representations.RecognizedKeywords;
import baraco.semantics.searching.VariableSearcher;
import baraco.semantics.symboltable.SymbolTableManager;
import baraco.semantics.symboltable.scopes.ClassScope;
import baraco.semantics.utils.Expression;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.math.BigDecimal;
import java.util.List;

public class EvaluationCommand implements ICommand, ParseTreeListener {

    private final static String TAG = "EvaluationCommand";

    private ExpressionContext parentExprCtx;
    private String modifiedExp;
    private BigDecimal resultValue;

    public EvaluationCommand(ExpressionContext exprCtx) {
        this.parentExprCtx = exprCtx;
    }

    @Override
    public void execute() {
        this.modifiedExp = this.parentExprCtx.getText();

        //catch rules if the value has direct boolean flags
        if(this.modifiedExp.contains(RecognizedKeywords.BOOLEAN_TRUE)) {
            this.resultValue = new BigDecimal(1);
        }
        else if(this.modifiedExp.contains(RecognizedKeywords.BOOLEAN_FALSE)) {
            this.resultValue = new BigDecimal(0);
        }
        else {
            ParseTreeWalker treeWalker = new ParseTreeWalker();
            treeWalker.walk(this, this.parentExprCtx);

            Expression evalEx = new Expression(this.modifiedExp);
            //Log.i(TAG,"Modified exp to eval: " +this.modifiedExp);
            this.resultValue = evalEx.eval();
        }

    }

    @Override
    public void visitTerminal(TerminalNode node) {

    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if (ctx instanceof ExpressionContext) {
            ExpressionContext exprCtx = (ExpressionContext) ctx;
            if (EvaluationCommand.isFunctionCall(exprCtx)) {
                this.evaluateFunctionCall(exprCtx);
            }

            else if (EvaluationCommand.isVariableOrConst(exprCtx)) {
                this.evaluateVariable(exprCtx);
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }

    public static boolean isFunctionCall(ExpressionContext exprCtx) {
        if (exprCtx.arguments() != null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isVariableOrConst(ExpressionContext exprCtx) {
        if (exprCtx.primary() != null && exprCtx.primary().Identifier() != null) {
            return true;
        } else {
            return false;
        }
    }

    private void evaluateFunctionCall(ExpressionContext exprCtx) {
        String functionName = exprCtx.expression(0).Identifier().getText();

        ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
                ParserHandler.getInstance().getCurrentClassName());
        BaracoMethod baracoMethod = classScope.searchMethod(functionName);

        if (exprCtx.arguments().expressionList() != null) {
            List<ExpressionContext> exprCtxList = exprCtx.arguments()
                    .expressionList().expression();

            for (int i = 0; i < exprCtxList.size(); i++) {
                ExpressionContext parameterExprCtx = exprCtxList.get(i);

                EvaluationCommand evaluationCommand = new EvaluationCommand(parameterExprCtx);
                evaluationCommand.execute();

                baracoMethod.mapParameterByValueAt(evaluationCommand.getResult().toEngineeringString(), i);
            }
        }

        baracoMethod.execute();

        System.out.println(TAG + ": " + "Before modified EXP function call: " + this.modifiedExp);
        this.modifiedExp = this.modifiedExp.replace(exprCtx.getText(),
                baracoMethod.getReturnValue().getValue().toString());
        System.out.println(TAG + ": " + "After modified EXP function call: " + this.modifiedExp);

    }

    private void evaluateVariable(ExpressionContext exprCtx) {
        BaracoValue mobiValue = VariableSearcher
                .searchVariable(exprCtx.getText());

        this.modifiedExp = this.modifiedExp.replaceFirst(exprCtx.getText(),
                mobiValue.getValue().toString());
    }

    /*
     * Returns the result
     */
    public BigDecimal getResult() {
        return this.resultValue;
    }

}
