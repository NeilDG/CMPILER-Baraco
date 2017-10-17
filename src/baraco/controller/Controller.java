package baraco.controller;

<<<<<<< HEAD
import moka.lexer.BaracoLexer;
import moka.parser.BaracoParser;
=======
import moka.lexer.MokaLexer;
import moka.parser.MokaBaseListener;
import moka.parser.MokaListener;
import moka.parser.MokaParser;
>>>>>>> master
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.util.List;

public class Controller {

    public void run(String input, JTextArea console) {
        // Perform interpretation

        console.setText("");
        console.append("Console:");
        console.append("\n");

        CharStream cs = new ANTLRInputStream(input);

        BaracoLexer mokaLexer = new BaracoLexer(cs);

        CommonTokenStream tokenStream = new CommonTokenStream(mokaLexer);

        tokenStream.fill();

        List<Token> tokens = tokenStream.getTokens();



        MokaParser parser = new MokaParser(tokenStream);

        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        MokaListener listener = new MokaBaseListener();
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

<<<<<<< HEAD
        BaracoLexer parser = new BaracoLexer(tokenStream);

        ParseTree tree = parser.compilationUnit();


=======
>>>>>>> master
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
