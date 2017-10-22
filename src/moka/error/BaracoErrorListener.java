package moka.error;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import javax.swing.*;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/**
 * Created by patricktobias on 18/10/2017.
 */
public class BaracoErrorListener extends BaseErrorListener {

    private ArrayList<BaracoError> errors;
    private JTextArea console;

    public BaracoErrorListener (JTextArea console) {
        this.console = console;

        errors = new ArrayList<BaracoError>();
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
        //System.err.println("Syntax Error @ Line " + i + " : " + i1 + " " + s);

        // TODO :
        // IDENTIFY ERRORS FROM String s
        //  - Extraneous Input
        //  - Mismatched Input
        //  - No viable alternative
        //  - Missing
        //  - Token Recognition
        // CREATE OWN ERROR MESSAGES AND SUGGESTIONS
        // THEN ADD THEM TO ERRORS LIST
        // USE getErrors() IN PRINTING THE ERRORS IN CONSOLE

        List<String> stack = ((Parser)recognizer).getRuleInvocationStack(); Collections.reverse(stack);
        //System.err.println("rule stack: "+stack);
        System.err.println("line "+i+":"+i1+" at "+": "+s);

        BaracoError error = new BaracoError();

        error.setLineNumber(i);
        error.setCharNumber(i1);

        if (s.contains(BaracoError.MISSING_KEY)) {
            error.setType(BaracoError.ErrorType.MISSING);
        } else if (s.contains(BaracoError.NO_VIABLE_ALT_KEY)) {
            error.setType(BaracoError.ErrorType.NO_VIABLE_ALTERNATIVE);
        } else if (s.contains(BaracoError.MISMATCHED_INPUT_KEY)) {
            error.setType(BaracoError.ErrorType.MISMATCHED_INPUT);
        } else if (s.contains(BaracoError.EXTRANEOUS_INPUT_KEY)) {
            error.setType(BaracoError.ErrorType.EXTRANEOUS_INPUT);
        } else if (s.contains(BaracoError.TOKEN_RECOGNITION_KEY)) {
            error.setType(BaracoError.ErrorType.TOKEN_RECOGNITION);
        }

        console.append("line "+i+":"+i1+" at "+": "+s);
        console.append("\n");
    }

    public ArrayList<BaracoError> getErrors () {
        return this.errors;
    }

    /*@Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
        System.err.println("Ambiguity @ Line " + i + " : " + i1);
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {
        System.err.println("Attempting Full Context @ Line " + i + " : " + i1);
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {
        System.err.println("Context Sensitivity @ Line " + i + " : " + i1);
    }*/

}
