package moka;

import moka.lexer.MokaLexer;
import org.antlr.v4.runtime.*;
import moka.parser.MokaLibrary;

import java.io.IOException;
import java.util.List;

import static moka.parser.MokaLibrary.print;

public class Main {

    public static void main(String[] args) throws IOException {
        String input = "print(\"asd\")";

        CharStream cs = new ANTLRInputStream(input);

        MokaLexer mokaLexer = new MokaLexer(cs);

        CommonTokenStream tokenStream = new CommonTokenStream(mokaLexer);

        tokenStream.fill();

        List<Token> tokens = tokenStream.getTokens();

        for(int i = 0; i < tokens.size(); i++) {
            System.out.println(MokaLexer.VOCABULARY.getSymbolicName(tokens.get(i).getType()));
            //System.out.println(tokens.get(i).getType());
        }

       print("print(\"amazing\")");
    }
}