package baraco.builder;

import baraco.antlr.error.BaracoError;
import baraco.ide.View;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.BitSet;

public class BuildChecker implements ANTLRErrorListener {

    private static BuildChecker sharedInstance = null;

    private boolean successful = true;

    public static BuildChecker getInstance() {
        return sharedInstance;
    }

    private BuildChecker() {

    }

    public static void initialize() {
        sharedInstance = new BuildChecker();
        ErrorRepository.initialize();
    }

    public static void reset() {
        sharedInstance.successful  = true;
        ErrorRepository.reset();
    }

    public boolean canExecute() {
        return this.successful;
    }

    public static void reportCustomError(int errorCode, String additionalMessage) {
        String errorMessage = ErrorRepository.getErrorMessage(errorCode) + " " + additionalMessage;
        //Console.log(LogType.ERROR, errorMessage);
        //System.out.println("ERROR: " + errorMessage);

        BaracoError baracoError = new BaracoError();

        baracoError.setErrorPrefix(errorMessage);

        View.appendErrorInConsole(baracoError);

        sharedInstance.successful = false;
    }

    public static void reportCustomError(int errorCode, String additionalMessage, Object... parameters) {
        String errorMessage = String.format(ErrorRepository.getErrorMessage(errorCode) + " " + additionalMessage, parameters);
        System.out.println("ERROR: " + errorMessage);
        //View.printInConsole("ERROR: " + errorMessage + "\n");

        String s[] = errorMessage.split("line [0-9]+");
        String line = errorMessage.substring(errorMessage.indexOf("line"), errorMessage.indexOf("."));

        String number = errorMessage.substring(errorMessage.indexOf("line ") + 5, errorMessage.indexOf(s[1]));

        BaracoError baracoError = new BaracoError();

        baracoError.setLineNumber( Integer.parseInt(number) );
        baracoError.setErrorPrefix(s[0]);
        baracoError.setLineLayout(line);
        baracoError.setErrorSuffix(s[1]);

        View.appendErrorInConsole(baracoError);

        sharedInstance.successful = false;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
        System.out.println("ERROR: " + "Syntax error at line " + i + ":" + i1 + ". " + s);
        View.printInConsole("ERROR: " + "Syntax error at line " + i + ":" + i1 + ". " + s);

        this.successful = false;
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

    }
}
