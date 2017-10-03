package baraco.controller;

import moka.lexer.MokaLexer;
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
        for(int i = 0; i < tokens.size(); i++)
            output += tokens.get(i).getText() + "\n";

        console.append("\n" + output);
    }
}
