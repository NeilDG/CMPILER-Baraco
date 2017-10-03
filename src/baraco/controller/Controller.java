package baraco.controller;

import moka.lexer.MokaLexer;
import moka.parser.MokaLibrary;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import javax.swing.*;
import java.util.List;

public class Controller {

    public void run(String input, JTextArea console) {
        // Perform interpretation

        CharStream cs = new ANTLRInputStream(input);

        MokaLexer mokaLexer = new MokaLexer(cs);

        CommonTokenStream tokenStream = new CommonTokenStream(mokaLexer);

        tokenStream.fill();

        List<Token> tokens = tokenStream.getTokens();

        String output = "";
        for(int i = 0; i < tokens.size(); i++) {
            //output += tokens.get(i).getText() + "\n";
            if (i == tokens.size() - 1)
                output += MokaLexer.VOCABULARY.getSymbolicName(tokens.get(i).getType());
            else
                output += MokaLexer.VOCABULARY.getSymbolicName(tokens.get(i).getType()) + ", ";
        }

        console.append("\n" + output);

        //TESTED PRINT FUNCTION
        /*
        console.setText("");
        console.append("Console:");
        console.append("\n");

        MokaLibrary.parsePrint(input);

        if(MokaLibrary.printStatement != null)
            console.append(MokaLibrary.printStatement);

        MokaLibrary.printStatement = "";
        */
    }
}
