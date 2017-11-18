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
import baraco.semantics.utils.StringUtils;
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

    private boolean isNumeric;

    private String stringResult;

    public EvaluationCommand(ExpressionContext exprCtx) {
        this.parentExprCtx = exprCtx;
    }

    @Override
    public void execute() {
        this.modifiedExp = this.parentExprCtx.getText();

        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.parentExprCtx);

        //System.out.println("ADSF " + modifiedExp);

        isNumeric = !modifiedExp.contains("\"");

        //catch rules if the value has direct boolean flags
        if(this.modifiedExp.contains(RecognizedKeywords.BOOLEAN_TRUE)) {

            this.resultValue = new BigDecimal(1);
            this.stringResult = this.resultValue.toEngineeringString();

        }
        else if(this.modifiedExp.contains(RecognizedKeywords.BOOLEAN_FALSE)) {

            this.resultValue = new BigDecimal(0);
            this.stringResult = this.resultValue.toEngineeringString();

        }
        else if (!isNumeric) {
            this.stringResult = StringUtils.removeQuotes(modifiedExp);;
        }
        else {

            if (modifiedExp.contains("!")) {
                modifiedExp = modifiedExp.replaceAll("!", "not");
                modifiedExp = modifiedExp.replaceAll("not=", "!=");
            }

            Expression evalEx = new Expression(this.modifiedExp);

            this.resultValue = evalEx.eval();
            this.stringResult = this.resultValue.toEngineeringString();

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
        BaracoValue baracoValue = VariableSearcher
                .searchVariable(exprCtx.getText());

        this.modifiedExp = this.modifiedExp.replaceFirst(exprCtx.getText(),
                baracoValue.getValue().toString());

        if (baracoValue.getPrimitiveType() == BaracoValue.PrimitiveType.STRING)
            modifiedExp = "\"" + modifiedExp + "\"";

        System.out.println("EVALUATED: " + modifiedExp);
    }

    /*
     * Returns the result
     */
    public BigDecimal getResult() {
        return this.resultValue;
    }

    public String getStringResult() {
        return stringResult;
    }

    public boolean isNumericResult() {
        return isNumeric;
    }
}
