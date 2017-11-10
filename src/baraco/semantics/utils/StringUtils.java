package baraco.semantics.utils;

public class StringUtils {
    public static String removeQuotes(String stringWithQuotes) {
        String newString = stringWithQuotes.replace("\"", "");

        return newString;
    }
}
