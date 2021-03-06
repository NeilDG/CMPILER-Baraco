package baraco.execution.commands.simple;

import baraco.builder.errorcheckers.UndeclaredChecker;
import baraco.execution.commands.EvaluationCommand;
import baraco.execution.commands.ICommand;
import baraco.antlr.parser.BaracoParser.*;
import baraco.ide.View;
import baraco.representations.BaracoArray;
import baraco.representations.BaracoValue;
import baraco.representations.BaracoValueSearcher;
import baraco.semantics.utils.Expression;
import baraco.semantics.utils.StringUtils;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintCommand implements ICommand, ParseTreeListener {

    private final static String TAG = "PrintCommand";

    private ExpressionContext expressionCtx;

    private String statementToPrint = "";
    private boolean isLN = false;

    private boolean evaluatedExp = false;

    public PrintCommand(StatementContext sCtx) {

        isLN = sCtx.PRINTLN() != null;

        this.expressionCtx = sCtx.expression(0);

        UndeclaredChecker undeclaredChecker = new UndeclaredChecker(expressionCtx);
        undeclaredChecker.verify();

        statementToPrint = "";
    }

    @Override
    public void execute() {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.expressionCtx);

        if (isLN)
            statementToPrint += "\n";

        View.printInConsole(this.statementToPrint);

        statementToPrint = "";
        evaluatedExp = false;
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitErrorNode(ErrorNode node) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

        if (ctx instanceof ExpressionContext && !evaluatedExp) {

            ExpressionContext expCtx = (ExpressionContext) ctx;

            EvaluationCommand evComm = new EvaluationCommand(expCtx);
            evComm.execute();

            if (evComm.isNumericResult())
                statementToPrint += evComm.getResult().toEngineeringString();
            else
                statementToPrint += evComm.getStringResult();

            evaluatedExp = true;

        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }

    public String getStatementToPrint() {
        return this.statementToPrint;
    }

}
