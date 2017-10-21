package moka.error;

/**
 * Created by patricktobias on 21/10/2017.
 */
public class BaracoError {

    private int lineNumber;
    private int charNumber;
    private String errorMsg;

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
}
