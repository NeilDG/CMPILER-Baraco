package baraco.semantics.utils;

import baraco.antlr.lexer.BaracoLexer;
import baraco.representations.BaracoValue;
import baraco.representations.RecognizedKeywords;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AssignmentUtils {

    /*
	 * Assigns an appropriate value depending on the primitive type. Since expression class returns a double value, we attempt
	 * to properly cast it. All expression commands accept INT, LONG, BYTE, SHORT, FLOAT and DOUBLE.
	 */
    public static void assignAppropriateValue(BaracoValue baracoValue, BigDecimal evaluationValue) {
        if(baracoValue.getPrimitiveType() == BaracoValue.PrimitiveType.INT) {
            baracoValue.setValue(Integer.toString(evaluationValue.intValue()));
        }
        else if(baracoValue.getPrimitiveType() == BaracoValue.PrimitiveType.DECIMAL) {
            baracoValue.setValue(Double.toString(evaluationValue.doubleValue()));
        }
        else if(baracoValue.getPrimitiveType() == BaracoValue.PrimitiveType.BOOL) {
            int result = evaluationValue.intValue();

            if(result == 1) {
                baracoValue.setValue(RecognizedKeywords.BOOLEAN_TRUE);
            }
            else {
                baracoValue.setValue(RecognizedKeywords.BOOLEAN_FALSE);
            }
        }
        else {
            System.out.println("AssignmentUtils: DID NOT FIND APPROPRIATE TYPE!!");
            //Console.log(LogType.DEBUG, "MobiValue: DID NOT FIND APPROPRIATE TYPE!!");
        }
    }

    public static void assignAppropriateValue(BaracoValue baracoValue, String stringValue) {
        if(baracoValue.getPrimitiveType() == BaracoValue.PrimitiveType.STRING) {
            baracoValue.setValue(stringValue);
        }
    }

    public static void assignAppropriateValue(BaracoValue baracoValue, BigDecimal evaluationValue, int tokenSign) {
        if(baracoValue.getPrimitiveType() == BaracoValue.PrimitiveType.INT) {
            int toAssignValue = evaluationValue.intValue();
            int finalValue = Integer.parseInt(baracoValue.getValue().toString());

            if (tokenSign == BaracoLexer.ADD_ASSIGN) {
                finalValue += toAssignValue;
            }
            else if (tokenSign == BaracoLexer.SUB_ASSIGN) {
                finalValue -= toAssignValue;
            }
            else if (tokenSign == BaracoLexer.MUL_ASSIGN) {
                finalValue *= toAssignValue;
            }
            else if (tokenSign == BaracoLexer.DIV_ASSIGN) {
                finalValue /= toAssignValue;
            }
            else if (tokenSign == BaracoLexer.MOD_ASSIGN) {
                finalValue %= toAssignValue;
            }

            baracoValue.setValue(finalValue + "");
        }
        else if(baracoValue.getPrimitiveType() == BaracoValue.PrimitiveType.DECIMAL) {
            baracoValue.setValue(Double.toString(evaluationValue.doubleValue()));

            double toAssignValue = evaluationValue.intValue();
            double finalValue = Double.parseDouble(baracoValue.getValue().toString());

            if (tokenSign == BaracoLexer.ADD_ASSIGN) {
                finalValue += toAssignValue;
            }
            else if (tokenSign == BaracoLexer.SUB_ASSIGN) {
                finalValue -= toAssignValue;
            }
            else if (tokenSign == BaracoLexer.MUL_ASSIGN) {
                finalValue *= toAssignValue;
            }
            else if (tokenSign == BaracoLexer.DIV_ASSIGN) {
                finalValue /= toAssignValue;
            }
            else if (tokenSign == BaracoLexer.MOD_ASSIGN) {
                finalValue %= toAssignValue;
            }

            baracoValue.setValue(finalValue + "");
        }
        /*else if(baracoValue.getPrimitiveType() == BaracoValue.PrimitiveType.BOOL) {
            int result = evaluationValue.intValue();

            if(result == 1) {
                baracoValue.setValue(RecognizedKeywords.BOOLEAN_TRUE);
            }
            else {
                baracoValue.setValue(RecognizedKeywords.BOOLEAN_FALSE);
            }
        }*/
    }

    public static void addAssignAppropriateValue(BaracoValue baracoValue, String stringValue) {
        if(baracoValue.getPrimitiveType() == BaracoValue.PrimitiveType.STRING) {
            String toAddValue = stringValue;
            String originalValue = baracoValue.getValue().toString();

            baracoValue.setValue(toAddValue + originalValue);
        }
    }
}
