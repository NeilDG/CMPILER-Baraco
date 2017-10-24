package moka.error;

import baraco.controller.Controller;
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
    private Controller controller;

    public BaracoErrorListener (Controller controller) {
        errors = new ArrayList<BaracoError>();

        this.controller = controller;
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

        String resultedMessage = "";

        if (s.contains(BaracoError.MISSING_KEY)) {

            error.setType(BaracoError.ErrorType.MISSING);

            String split[] = s.split(BaracoError.MISSING_KEY);

            String tokens[] = split[1].split("at");

            resultedMessage = "Missing " + tokens[0] + " before " + tokens[1] + " at line " + i + " @ " + i1 + ". Try adding " + tokens[0] + " before " + tokens[1] + ".";

        } else if (s.contains(BaracoError.NO_VIABLE_ALT_KEY)) {

            error.setType(BaracoError.ErrorType.NO_VIABLE_ALTERNATIVE);

            String split[] = s.split(BaracoError.NO_VIABLE_ALT_KEY);

            resultedMessage = "Could not resolve the token " + split[1] + " at line " + i + " @ " + i1 + ".";

        } else if (s.contains(BaracoError.MISMATCHED_INPUT_KEY)) {

            error.setType(BaracoError.ErrorType.MISMATCHED_INPUT);

            String split[] = s.split(BaracoError.MISMATCHED_INPUT_KEY);

            String str[] = new String[1];

            if (split[1].contains("expecting")) {
                str = split[1].split("expecting");
            }

            if (str[1].contains("IntegerLiteral") && str[1].contains("FloatingPointLiteral") && str[1].contains("BooleanLiteral") && str[1].contains("CharacterLiteral")
                    && str[1].contains("StringLiteral") && str[1].contains("Identifier")) {
                resultedMessage = "Mismatched input " + str[0] + " try replacing it with an expression at line " + i + " @ " + i1;
            } else if (str[1].contains("Identifier"))
                resultedMessage = "Expected identifier at line " + i + " @ " + i1;
            else
                resultedMessage = "Mismatched input " + str[0] + " try replacing it with " + str[1] + " at line " + i + " @ " + i1 + ".";

        } else if (s.contains(BaracoError.EXTRANEOUS_INPUT_KEY)) {

            error.setType(BaracoError.ErrorType.EXTRANEOUS_INPUT);

            String split[] = s.split(BaracoError.EXTRANEOUS_INPUT_KEY);

            String str[] = new String[1];
            for (int k = 0; k < split.length; k++) { // test
                //System.out.print("k: ");
                split[k] = split[k].trim();

                if (split[k].contains("expecting")) {
                    str = split[k].split("expecting");
                }
            }

            if (str[1].contains("'end'")) {
                resultedMessage = "Missing 'end' statement at line " + i + " @ " + i1;
            } else if (str[1].contains("IntegerLiteral") && str[1].contains("FloatingPointLiteral") && str[1].contains("BooleanLiteral") && str[1].contains("CharacterLiteral")
                    && str[1].contains("StringLiteral") && str[1].contains("Identifier")) {

                resultedMessage = "Extraneous Input at line " + i + " @ " + i1 + " : Consider removing " + str[0] + " and replacing it with an expression.";

            } else {
                resultedMessage = "Extraneous Input at line " + i + " @ " + i1 + " : Consider removing " + str[0] + " and replacing it with " + str[1] + ".";
            }

        } else if (s.contains(BaracoError.TOKEN_RECOGNITION_KEY)) {
            error.setType(BaracoError.ErrorType.TOKEN_RECOGNITION);
        }

        /*console.append(resultedMessage);
        //console.append("line "+i+":"+i1+" at "+": "+s);
        if (!resultedMessage.isEmpty())
            console.append("\n");*/

        error.setErrorMsg(resultedMessage);

        controller.printErrorInConsole(error);
        errors.add(error);
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
