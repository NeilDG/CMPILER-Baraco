package baraco.controller;

import baraco.antlr.error.BaracoError;
import baraco.antlr.error.BaracoErrorListener;
import baraco.builder.BuildChecker;
import baraco.builder.ParserHandler;
import baraco.execution.ExecutionManager;
import baraco.execution.MethodTracker;
import baraco.ide.View;
import baraco.antlr.lexer.BaracoLexer;
import baraco.antlr.parser.BaracoBaseListener;
import baraco.antlr.parser.BaracoListener;
import baraco.antlr.parser.BaracoParser;
import baraco.semantics.statements.StatementControlOverseer;
import baraco.semantics.symboltable.SymbolTableManager;
import baraco.semantics.symboltable.scopes.LocalScopeCreator;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

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

        view.appendErrorInConsole(error);

    }

    public void run(String input) {
        // Perform interpretation

        ExecutionManager.reset();
        LocalScopeCreator.reset();
        SymbolTableManager.reset();
        BuildChecker.reset();
        StatementControlOverseer.reset();
        MethodTracker.reset();

        view.resetConsole();

        System.out.println(input);

        ParserHandler.getInstance().parseText("Test", input);

        /*CharStream cs = new ANTLRInputStream(input);

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
        walker.walk(listener, tree);*/

        if(BuildChecker.getInstance().canExecute()) {
            ExecutionManager.getInstance().executeAllActions();
            System.out.println("BuildChecker executed");
            //this.mViewPager.setCurrentItem(1);
        }
        else {
            System.out.println("Fix identified errors before executing!");
        }

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
