package baraco.controller;

import moka.error.BaracoError;
import moka.error.BaracoErrorListener;
import baraco.ide.View;
import moka.lexer.BaracoLexer;
import moka.parser.BaracoBaseListener;
import moka.parser.BaracoListener;
import moka.parser.BaracoParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public void printErrorsInConsole (ArrayList<BaracoError> errors) {

        for (int i = 0; i < errors.size(); i++) {
            printErrorInConsole(errors.get(i));
        }

    }

    public void printErrorInConsole (BaracoError error) {

        view.appendErrorInConsole(error.getErrorMsg());

    }

    public void run(String input) {
        // Perform interpretation

        /*console.setText("");
        console.append("Console:");
        console.append("\n");*/

        view.resetConsole();

        CharStream cs = new ANTLRInputStream(input);

        BaracoLexer mokaLexer = new BaracoLexer(cs);

        CommonTokenStream tokenStream = new CommonTokenStream(mokaLexer);

        tokenStream.fill();

        List<Token> tokens = tokenStream.getTokens();

        BaracoParser parser = new BaracoParser(tokenStream);

        BaracoErrorListener baracoErrorListener = new BaracoErrorListener(this);

        parser.removeErrorListeners();
        parser.addErrorListener(baracoErrorListener);

        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        BaracoListener listener = new BaracoBaseListener();
        walker.walk(listener, tree);

        /*String output = "";
        for(int i = 0; i < tokens.size(); i++) {
            //output += tokens.get(i).getText() + "\n";
            if (i == tokens.size() - 1) {
                output += MokaLexer.VOCABULARY.getSymbolicName(tokens.get(i).getType());
            }
            else {
                output += MokaLexer.VOCABULARY.getSymbolicName(tokens.get(i).getType()) + ", ";
            }
        }

        System.out.print(output);

        console.append("\n" + output);*/

        //TESTED PRINT FUNCTION

        /*console.setText("");
        console.append("Console:");
        console.append("\n");

        MokaLibrary.parsePrint(input);

        if(MokaLibrary.printStatement != null)
            console.append(MokaLibrary.printStatement);

        MokaLibrary.printStatement = "";*/

    }

}
