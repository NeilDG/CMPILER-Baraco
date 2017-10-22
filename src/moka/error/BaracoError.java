package moka.error;

/**
 * Created by patricktobias on 21/10/2017.
 */
public class BaracoError {

    public static final String NO_VIABLE_ALT_KEY = "no viable alternative";
    public static final String MISSING_KEY = "missing";
    public static final String MISMATCHED_INPUT_KEY = "mismatched input";
    public static final String EXTRANEOUS_INPUT_KEY = "extraneous input";
    public static final String TOKEN_RECOGNITION_KEY = "token recognition";

    private int lineNumber;
    private int charNumber;
    private String errorMsg;
    private ErrorType type;

    public enum ErrorType {
        NO_VIABLE_ALTERNATIVE,
        MISSING,
        MISMATCHED_INPUT,
        EXTRANEOUS_INPUT,
        TOKEN_RECOGNITION
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getCharNumber() {
        return charNumber;
    }

    public void setCharNumber(int charNumber) {
        this.charNumber = charNumber;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ErrorType getType() {
        return type;
    }

    public void setType(ErrorType type) {
        this.type = type;
    }
}
