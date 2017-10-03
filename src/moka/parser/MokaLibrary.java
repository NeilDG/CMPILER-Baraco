package moka.parser;

import moka.lexer.MokaLexer;
import moka.parser.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class MokaLibrary {

    public static void print(String input){

        CharStream cs = new ANTLRInputStream(input);

        MokaLexer mokaLexer = new MokaLexer(cs);
        CommonTokenStream tokenStream = new CommonTokenStream(mokaLexer);
        MokaParser mokaParser = new MokaParser(tokenStream);

        MokaParser.Print_statementContext printStatementContext = mokaParser.print_statement();

        ParseTreeWalker walker = new ParseTreeWalker();
        MokaPrintListener mokaPrintlistener = new MokaPrintListener();
        walker.walk(mokaPrintlistener, printStatementContext);
    }
}
