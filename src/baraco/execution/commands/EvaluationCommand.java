package baraco.execution.commands;

import baraco.antlr.parser.BaracoParser.*;
import baraco.builder.ParserHandler;
import baraco.representations.*;
import baraco.semantics.searching.VariableSearcher;
import baraco.semantics.symboltable.SymbolTableManager;
import baraco.semantics.symboltable.scopes.ClassScope;
import baraco.semantics.utils.Expression;
import baraco.semantics.utils.Expression.LazyFunction;
import baraco.semantics.utils.Expression.LazyNumber;
import baraco.semantics.utils.StringUtils;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Pattern;

public class EvaluationCommand implements ICommand, ParseTreeListener {

    private final static String TAG = "EvaluationCommand";

    private ExpressionContext parentExprCtx;
    private String modifiedExp;
    private BigDecimal resultValue;
    private String stringResult = "";

    private boolean isNumeric;

    public EvaluationCommand(ExpressionContext exprCtx) {
        this.parentExprCtx = exprCtx;
    }

    @Override
    public void execute() {

        //System.out.println("EvaluationCommand: executing");
        this.modifiedExp = this.parentExprCtx.getText();

        for (ExpressionContext eCtx : this.parentExprCtx.expression()) { // bias functions in evaluating
            if (isFunctionCall(eCtx)) {
                EvaluationCommand evaluationCommand = new EvaluationCommand(eCtx);
                evaluationCommand.execute();

                this.modifiedExp = this.modifiedExp.replace(eCtx.getText(), evaluationCommand.modifiedExp);
            }
        }

        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.parentExprCtx);

        isNumeric = !this.modifiedExp.contains("\"") && !this.modifiedExp.contains("\'");

        if (!isNumeric) {

            if (this.modifiedExp.contains("==") || this.modifiedExp.contains("!=")) {


                String[] strings = {"", ""};

                if (this.modifiedExp.contains("=="))
                    strings = this.modifiedExp.split("==");

                if (this.modifiedExp.contains("!="))
                    strings = this.modifiedExp.split("!=");

                String equalityFunction = "STREQ("+strings[0]+", " + strings[1] + ")";

                if (this.modifiedExp.contains("!="))
                    equalityFunction = "not(" + equalityFunction + ")";

                Expression e = new Expression(equalityFunction);

                e.addLazyFunction(e.new LazyFunction("STREQ", 2) {

                    private LazyNumber ZERO = new LazyNumber() {
                        public BigDecimal eval() {
                            return BigDecimal.ZERO;
                        }
                        public String getString() {
                            return "0";
                        }
                    };

                    private LazyNumber ONE = new LazyNumber() {
                        public BigDecimal eval() {
                            return BigDecimal.ONE;
                        }
                        public String getString() {
                            return null;
                        }
                    };

                    public LazyNumber lazyEval(List<LazyNumber> lazyParams) {
                        if (lazyParams.get(0).getString().equals(lazyParams.get(1).getString())) {
                            return ONE;
                        }
                        return ZERO;
                    }
                });

                this.resultValue = e.eval();
                isNumeric = true;
            }else if (this.parentExprCtx.expression().size() != 0 &&
                    !isArrayElement(parentExprCtx) &&
                    !isFunctionCall(parentExprCtx)) {

                for (ExpressionContext expCtx :
                        this.parentExprCtx.expression()) {

                    if (!isArray(expCtx)) {

                        EvaluationCommand innerEvCmd = new EvaluationCommand(expCtx);
                        innerEvCmd.execute();

                        if (innerEvCmd.isNumericResult())
                            this.stringResult += innerEvCmd.getResult().toEngineeringString();
                        else
                            this.stringResult += innerEvCmd.getStringResult();

                    }
                }

            } else {
                this.stringResult = StringUtils.removeQuotes(modifiedExp);
            }

        } else {

            if (this.modifiedExp.contains("!")) {
                this.modifiedExp = this.modifiedExp.replaceAll("!", "not");
                this.modifiedExp = this.modifiedExp.replaceAll("not=", "!=");
            }

            if (this.modifiedExp.contains("and")) {
                this.modifiedExp = this.modifiedExp.replaceAll("and", "&&");
            }

            if (this.modifiedExp.contains("or")) {
                this.modifiedExp = this.modifiedExp.replaceAll("or", "||");
            }

            Expression evalEx = new Expression(this.modifiedExp);

            this.resultValue = evalEx.eval(false);
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
            } else if (EvaluationCommand.isArrayElement(exprCtx)) {
                this.evaluateArray(exprCtx);
            } else if (EvaluationCommand.isVariableOrConst(exprCtx)) {
                this.evaluateVariable(exprCtx);
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }

    public static boolean isFunctionCall(ExpressionContext exprCtx) {
        Pattern functionPattern = Pattern.compile("([a-zA-Z0-9]+)\\(([ ,.a-zA-Z0-9]*)\\)");

        if (exprCtx.expressionList() != null || functionPattern.matcher(exprCtx.getText()).matches()) {
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

    public static boolean isArrayElement(ExpressionContext exprCtx) {
        if (exprCtx.expression(0) != null && exprCtx.expression(1) != null) {
            BaracoValue value = BaracoValueSearcher.searchBaracoValue(exprCtx.expression(0).getText());

            if (value != null)
                return value.getPrimitiveType() == BaracoValue.PrimitiveType.ARRAY;
            else
                return false;
        } else {
            return false;
        }
    }

    public static boolean isArray(ExpressionContext exprCtx) {
        BaracoValue value = BaracoValueSearcher.searchBaracoValue(exprCtx.getText());

        if (value != null) {
            return value.getPrimitiveType() == BaracoValue.PrimitiveType.ARRAY && !isArrayElement(exprCtx);
        }

        return false;
    }

    public static boolean isArray(String s) {
        BaracoValue value = BaracoValueSearcher.searchBaracoValue(s);

        if (value != null) {
            return value.getPrimitiveType() == BaracoValue.PrimitiveType.ARRAY;
        }

        return false;
    }

    private void evaluateFunctionCall(ExpressionContext exprCtx) {

        for (ExpressionContext eCtx : exprCtx.expression()) {

            String functionName = eCtx.getText();

            ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
                    ParserHandler.getInstance().getCurrentClassName());
            BaracoMethod baracoMethod = classScope.searchMethod(functionName);

            if (baracoMethod == null) {
                return;
            }

            List<ExpressionContext> exprCtxList;

            if (eCtx.expressionList() != null) {
                exprCtxList = eCtx.expressionList().expression();
            } else {
                exprCtxList = exprCtx.expressionList().expression();
            }

            for (int i = 0; i < exprCtxList.size(); i++) {
                ExpressionContext parameterExprCtx = exprCtxList.get(i);

                if (isArray(parameterExprCtx)) {
                    BaracoValue barArray = BaracoValueSearcher.searchBaracoValue(parameterExprCtx.getText());
                    baracoMethod.mapArrayAt(barArray, i, parameterExprCtx.getText());
                } else {
                    EvaluationCommand evaluationCommand = new EvaluationCommand(parameterExprCtx);
                    evaluationCommand.execute();

                    if (evaluationCommand.getResult() != null || !evaluationCommand.getStringResult().equals("")) {
                        if (evaluationCommand.isNumericResult())
                            baracoMethod.mapParameterByValueAt(evaluationCommand.getResult().toEngineeringString(), i);
                        else
                            baracoMethod.mapParameterByValueAt(evaluationCommand.getStringResult(), i);
                    }
                }
            }

            baracoMethod.execute();

            //System.out.println(TAG + ": " + "Before modified EXP function call: " + this.modifiedExp);


            if (baracoMethod.getReturnType() == BaracoMethod.MethodType.STRING_TYPE) {
                this.modifiedExp = this.modifiedExp.replace(exprCtx.getText(),
                        "\"" + baracoMethod.getReturnValue().getValue().toString() + "\"");
            } else {
                this.modifiedExp = this.modifiedExp.replace(exprCtx.getText(),
                        baracoMethod.getReturnValue().getValue().toString());
            }

            //System.out.println(TAG + ": " + "After modified EXP function call: " + this.modifiedExp);

        }
    }

    private void evaluateVariable(ExpressionContext exprCtx) {
        BaracoValue baracoValue = VariableSearcher
                .searchVariable(exprCtx.getText());

        if (baracoValue == null || baracoValue.getPrimitiveType() == BaracoValue.PrimitiveType.ARRAY) {
            return;
        }

        if (baracoValue.getPrimitiveType() == BaracoValue.PrimitiveType.STRING) {
            this.modifiedExp = this.modifiedExp.replaceFirst(exprCtx.getText(),
                    "\"" + baracoValue.getValue().toString() + "\"");
        } else if (baracoValue.getPrimitiveType() == BaracoValue.PrimitiveType.CHAR) {
            this.modifiedExp = this.modifiedExp.replaceFirst(exprCtx.getText(),
                    "'" + baracoValue.getValue().toString() + "'");
        } else {
            this.modifiedExp = this.modifiedExp.replaceFirst(exprCtx.getText(),
                    baracoValue.getValue().toString());
        }

        //System.out.println("EVALUATED: " + modifiedExp);
    }

    private void evaluateArray(ExpressionContext exprCtx) {
        BaracoValue value = BaracoValueSearcher.searchBaracoValue(exprCtx.expression(0).getText());

        if (value != null) {
            if (value.getPrimitiveType() == BaracoValue.PrimitiveType.ARRAY) {

                BaracoArray baracoArray = (BaracoArray) value.getValue();

                EvaluationCommand evCmd = new EvaluationCommand(exprCtx.expression(1));
                evCmd.execute();

                BaracoValue arrayMobiValue = baracoArray.getValueAt(evCmd.getResult().intValue());

                if (arrayMobiValue.getPrimitiveType() == BaracoValue.PrimitiveType.STRING) {
                    //this.modifiedExp = this.modifiedExp.replaceFirst(exprCtx.expression(0).getText() + "\\[([a-zA-Z0-9]*)]", "\"" + arrayMobiValue.getValue().toString() + "\"");
                    this.modifiedExp = this.modifiedExp.replace(exprCtx.getText(), "\"" + arrayMobiValue.getValue().toString() + "\"");
                } else {
                    //this.modifiedExp = this.modifiedExp.replaceFirst(exprCtx.expression(0).getText() + "\\[([a-zA-Z0-9]*)]", arrayMobiValue.getValue().toString());
                    this.modifiedExp = this.modifiedExp.replace(exprCtx.getText(), arrayMobiValue.getValue().toString());
                }

            }
        }

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

    public String getModifiedExp() { return modifiedExp;}

    public boolean isNumericResult() {
        return isNumeric;
    }
}
