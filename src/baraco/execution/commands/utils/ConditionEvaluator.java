package baraco.execution.commands.utils;

import baraco.antlr.parser.BaracoParser;
import baraco.execution.commands.EvaluationCommand;
import baraco.semantics.utils.Expression;

import java.math.BigDecimal;

public class ConditionEvaluator {

    private final static String TAG = "ConditionEvaluator";

	/*
	 * Evaluates the modified conditional expression via Eval-Ex
	 */
	/*public static boolean evaluateCondition(String modifiedConditionExpr) {

		//catch rules if the if value has direct boolean flags
		if(modifiedConditionExpr.contains("(true)")) {
			return true;
		}
		else if(modifiedConditionExpr.contains("(false)")) {
			return false;
		}

		Expression expr = new Expression(modifiedConditionExpr);
		int result = expr.eval().intValue();

		//Console.log("Evaluating " +modifiedConditionExpr+ ". result is " +result);

		if(result == 1) {
			return true;
		}
		else {
			return false;
		}
	}*/

    public static boolean evaluateCondition(BaracoParser.ParExpressionContext parExprCtx) {

        BaracoParser.ExpressionContext conditionExprCtx = parExprCtx.expression();

        //catch rules if the if value has direct boolean flags
        if(conditionExprCtx.getText().contains("(true)")) {
            return true;
        }
        else if(conditionExprCtx.getText().contains("(false)")) {
            return false;
        }

        EvaluationCommand evaluationCommand = new EvaluationCommand(conditionExprCtx);
        evaluationCommand.execute();

        int result = evaluationCommand.getResult().intValue();

        System.out.println("Evaluating: " +conditionExprCtx.getText() + " Result: " +result);

        return (result == 1);
    }

    public static boolean evaluateCondition(String condition) {

        //catch rules if the if value has direct boolean flags
        if(condition.contains("(true)")) {
            return true;
        }
        else if(condition.contains("(false)")) {
            return false;
        }

        //EvaluationCommand evaluationCommand = new EvaluationCommand(conditionExprCtx);
        //evaluationCommand.execute();

        Expression expression = new Expression(condition);

        BigDecimal result = expression.eval();

        //System.out.println("Evaluating: " +conditionExprCtx.getText() + " Result: " +result);

        return (1 == Integer.parseInt(result.toEngineeringString()));
    }

    public static boolean evaluateCondition(BaracoParser.ExpressionContext conditionExprCtx) {

        //catch rules if the if value has direct boolean flags
        if(conditionExprCtx.getText().contains("(true)")) {
            return true;
        }
        else if(conditionExprCtx.getText().contains("(false)")) {
            return false;
        }

        EvaluationCommand evaluationCommand = new EvaluationCommand(conditionExprCtx);
        evaluationCommand.execute();

        int result = evaluationCommand.getResult().intValue();

        return (result == 1);
    }
}