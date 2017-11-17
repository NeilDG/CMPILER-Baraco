package baraco.execution.commands.simple;

import baraco.execution.commands.EvaluationCommand;
import baraco.execution.commands.ICommand;
import baraco.antlr.parser.BaracoParser.*;
import baraco.ide.View;
import baraco.representations.BaracoArray;
import baraco.representations.BaracoValue;
import baraco.representations.BaracoValueSearcher;
import baraco.representations.RecognizedKeywords;
import baraco.semantics.utils.Expression;
import baraco.semantics.utils.StringUtils;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class PrintCommand implements ICommand, ParseTreeListener {

    private final static String TAG = "PrintCommand";

    private ExpressionContext expressionCtx;

    private String statementToPrint = "";
    private boolean complexExpr = false;
    private boolean arrayAccess = false;
    private boolean containString = false;

    private List<Object> printExpr = new ArrayList<>();

    public PrintCommand(ExpressionContext expressionCtx) {
        this.expressionCtx = expressionCtx;

        containString = expressionCtx.getText().contains("\"");

        //UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.expressionCtx);
        //undeclaredChecker.verify();
    }

    @Override
    public void execute() {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.expressionCtx);

        View.printInConsole(this.statementToPrint);
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

        if(ctx instanceof LiteralContext) {

            System.out.println("LITERAL CONT " + ctx.getText());

            LiteralContext literalCtx = (LiteralContext) ctx;

            if (literalCtx.StringLiteral() != null) {
                String quotedString = literalCtx.StringLiteral().getText();

                this.statementToPrint += StringUtils.removeQuotes(quotedString);

                literalCtx.children = null;
            } else if (literalCtx.IntegerLiteral() != null) {
                int value = Integer.parseInt(literalCtx.IntegerLiteral().getText());
                this.statementToPrint += value;
            } else if (literalCtx.FloatingPointLiteral() != null) {
                float value = Float.parseFloat(literalCtx.FloatingPointLiteral().getText());
                this.statementToPrint += value;
            } else if (literalCtx.BooleanLiteral() != null) {
                this.statementToPrint += literalCtx.BooleanLiteral().getText();
            } else if (literalCtx.CharacterLiteral() != null) {
                this.statementToPrint += literalCtx.CharacterLiteral().getText();
            }

        } else if(ctx instanceof PrimaryContext) {

            System.out.println("PRIMARY CONTEXT");

            PrimaryContext primaryCtx = (PrimaryContext) ctx;

            if(primaryCtx.expression() != null && !primaryCtx.expression().getText().contains("\"")) {

                ExpressionContext exprCtx = primaryCtx.expression();

                this.complexExpr = true;
                System.out.println("Complex expression detected: " +exprCtx.getText());

                EvaluationCommand evaluationCommand = new EvaluationCommand(exprCtx);
                evaluationCommand.execute();

                //this.printExpr.add(evaluationCommand.getResult());
                this.statementToPrint += evaluationCommand.getStringResult();

                ctx.children = null;
            }

            else if(primaryCtx.Identifier() != null && !this.complexExpr) {
                String identifier = primaryCtx.getText();

                BaracoValue value = BaracoValueSearcher.searchBaracoValue(identifier);
                if(value.getPrimitiveType() == BaracoValue.PrimitiveType.ARRAY) {
                    this.arrayAccess = true;
                    this.evaluateArrayPrint(value, primaryCtx);
                }
                else if(!this.arrayAccess) {
                    this.statementToPrint += value.getValue();
                    printExpr.add(value.getValue());
                }


            }
        } else if (ctx instanceof ExpressionContext && !containString) {

            try {
                ExpressionContext expCtx = (ExpressionContext) ctx;

                EvaluationCommand evComm = new EvaluationCommand(expCtx);
                evComm.execute();

                ctx.children = null;

                //printExpr.add(evComm.getResult());
                statementToPrint += evComm.getStringResult();
            } catch (ClassCastException ex) {

            } catch (Expression.ExpressionException ex) {

            }

        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }

    public String getStatementToPrint() {
        return this.statementToPrint;
    }

    private void evaluateArrayPrint(BaracoValue baracoValue, PrimaryContext primaryCtx) {

        //move up and determine expression contexts
        ExpressionContext parentExprCtx = (ExpressionContext) primaryCtx.getParent().getParent();
        ExpressionContext arrayIndexExprCtx = parentExprCtx.expression(1);

        EvaluationCommand evaluationCommand = new EvaluationCommand(arrayIndexExprCtx);
        evaluationCommand.execute();

        BaracoArray baracoArray = (BaracoArray) baracoValue.getValue();
        BaracoValue arrayMobiValue = baracoArray.getValueAt(evaluationCommand.getResult().intValue());

        this.statementToPrint += arrayMobiValue.getValue().toString();
    }
}
