package baraco.controller;

import baraco.antlr.error.BaracoError;
import baraco.antlr.error.BaracoErrorListener;
import baraco.builder.BuildChecker;
import baraco.builder.ParserHandler;
import baraco.execution.ExecutionManager;
import baraco.execution.MethodTracker;
import baraco.antlr.lexer.BaracoLexer;
import baraco.antlr.parser.BaracoBaseListener;
import baraco.antlr.parser.BaracoListener;
import baraco.antlr.parser.BaracoParser;
import baraco.ide.View;
import baraco.semantics.statements.StatementControlOverseer;
import baraco.semantics.symboltable.SymbolTableManager;
import baraco.semantics.symboltable.scopes.LocalScopeCreator;
import baraco.semantics.utils.LocalVarTracker;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public void run(String input, String fileName) {
        // Perform interpretation

        ExecutionManager.reset();
        LocalScopeCreator.reset();
        SymbolTableManager.reset();
        BuildChecker.reset();
        StatementControlOverseer.reset();
        MethodTracker.reset();
        LocalVarTracker.reset();

        view.resetConsole();

        System.out.println(input);

        ParserHandler.getInstance().parseText(fileName, input);

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

    public void buildOnly(String input, String fileName) {
        ExecutionManager.reset();
        LocalScopeCreator.reset();
        SymbolTableManager.reset();
        BuildChecker.reset();
        StatementControlOverseer.reset();
        MethodTracker.reset();
        LocalVarTracker.reset();

        System.out.println(input);

        ParserHandler.getInstance().parseText(fileName, input);
    }

}
