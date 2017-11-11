package baraco.execution.commands.simple;

import baraco.execution.commands.EvaluationCommand;
import baraco.execution.commands.ICommand;
import baraco.antlr.parser.BaracoParser.*;
import baraco.ide.View;
import baraco.representations.BaracoArray;
import baraco.representations.BaracoValue;
import baraco.representations.BaracoValueSearcher;
import baraco.semantics.utils.StringUtils;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class PrintCommand implements ICommand, ParseTreeListener {

    private final static String TAG = "PrintCommand";

    private ExpressionContext expressionCtx;

    private String statementToPrint = "";
    private boolean complexExpr = false;
    private boolean arrayAccess = false;

    public PrintCommand(ExpressionContext expressionCtx) {
        this.expressionCtx = expressionCtx;

        //UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.expressionCtx);
        //undeclaredChecker.verify();
    }

    @Override
    public void execute() {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.expressionCtx);

        System.out.println(this.statementToPrint);
        View.printInConsole(this.statementToPrint);
        this.statementToPrint = ""; //reset statement to print afterwards
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
            LiteralContext literalCtx = (LiteralContext) ctx;

            if(literalCtx.StringLiteral() != null) {
                String quotedString = literalCtx.StringLiteral().getText();

                this.statementToPrint += StringUtils.removeQuotes(quotedString);
            }
			/*else if(literalCtx.IntegerLiteral() != null) {
				int value = Integer.parseInt(literalCtx.IntegerLiteral().getText());
				this.statementToPrint += value;
			}

			else if(literalCtx.FloatingPointLiteral() != null) {
				float value = Float.parseFloat(literalCtx.FloatingPointLiteral().getText());
				this.statementToPrint += value;
			}

			else if(literalCtx.BooleanLiteral() != null) {
				this.statementToPrint += literalCtx.BooleanLiteral().getText();
			}

			else if(literalCtx.CharacterLiteral() != null) {
				this.statementToPrint += literalCtx.CharacterLiteral().getText();
			}*/
        }

        else if(ctx instanceof PrimaryContext) {
            PrimaryContext primaryCtx = (PrimaryContext) ctx;

            if(primaryCtx.expression() != null) {
                ExpressionContext exprCtx = primaryCtx.expression();
                this.complexExpr = true;
                System.out.println("Complex expression detected: " +exprCtx.getText());

                EvaluationCommand evaluationCommand = new EvaluationCommand(exprCtx);
                evaluationCommand.execute();

                this.statementToPrint += evaluationCommand.getResult().toEngineeringString();
            }

            else if(primaryCtx.Identifier() != null && this.complexExpr == false) {
                String identifier = primaryCtx.getText();

                BaracoValue value = BaracoValueSearcher.searchBaracoValue(identifier);
                if(value.getPrimitiveType() == BaracoValue.PrimitiveType.ARRAY) {
                    this.arrayAccess = true;
                    this.evaluateArrayPrint(value, primaryCtx);
                }
                else if(this.arrayAccess == false) {
                    this.statementToPrint += value.getValue();
                }


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
