package moka.lexer;

import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String input = "for (int i = 0; i < 10; i++) end";

        CharStream cs = new ANTLRInputStream(input);

        MokaLexer mokaLexer = new MokaLexer(cs);

        CommonTokenStream tokenStream = new CommonTokenStream(mokaLexer);

        tokenStream.fill();

        List<Token> tokens = tokenStream.getTokens();

        for(int i = 0; i < tokens.size(); i++)
            System.out.println(MokaLexer.VOCABULARY.getSymbolicName(tokens.get(i).getType()));
            //System.out.println(tokens.get(i).getText());

    }
}
