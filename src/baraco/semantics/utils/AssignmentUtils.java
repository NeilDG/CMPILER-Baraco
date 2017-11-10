package baraco.semantics.utils;

import baraco.representations.BaracoValue;
import baraco.representations.RecognizedKeywords;

import java.math.BigDecimal;

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
            //Console.log(LogType.DEBUG, "MobiValue: DID NOT FIND APPROPRIATE TYPE!!");
        }
    }
}
