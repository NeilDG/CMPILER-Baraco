package moka.parser;

import moka.lexer.MokaLexer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.util.List;

public class MokaPrintListener extends MokaBaseListener{

    @Override
    public void enterPrint_statement(MokaParser.Print_statementContext ctx) {

        CharStream cs = new ANTLRInputStream(ctx.getText());

        MokaLexer mokaLexer = new MokaLexer(cs);

        CommonTokenStream tokenStream = new CommonTokenStream(mokaLexer);

        tokenStream.fill();

        List<Token> tokens = tokenStream.getTokens();
        //System.out.println(ctx.getChild(1).getText());

        for(int i = 0; i < tokens.size(); i++){
            if(tokens.get(i).getType() == 68) {
                //System.out.print(tokens.get(i).getText());
                MokaLibrary.printStatement += tokens.get(i).getText();
            }
        }
    }

    @Override
    public void exitPrint_statement(MokaParser.Print_statementContext ctx) {
        System.out.print(MokaLibrary.printStatement);
    }
}
