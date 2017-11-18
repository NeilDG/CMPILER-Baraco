/**
 *
 */
package baraco.builder.errorcheckers;

import baraco.antlr.parser.BaracoParser;
import baraco.semantics.searching.VariableSearcher;
import baraco.semantics.utils.Expression;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import baraco.builder.BuildChecker;
import baraco.builder.ErrorRepository;
import baraco.antlr.parser.BaracoParser.ExpressionContext;
import baraco.antlr.parser.BaracoParser.PrimaryContext;
import baraco.antlr.parser.BaracoParser.LiteralContext;
import baraco.representations.BaracoValue;
import baraco.representations.BaracoValue.PrimitiveType;

import java.util.EmptyStackException;

/**
 * Handles all the type checking
 * @author NeilDG
 *
 */
public class TypeChecker implements IErrorChecker, ParseTreeListener {

    private BaracoValue baracoValue;
    private ExpressionContext exprCtx;
    private int lineNumber;
    private String exprString;

    private boolean evaluated;
    private boolean varEvaluated;

    public TypeChecker(BaracoValue assignmentMobiValue, ExpressionContext exprCtx) {
        this.baracoValue = assignmentMobiValue;
        this.exprCtx = exprCtx;

        Token firstToken = exprCtx.getStart();
        this.lineNumber = firstToken.getLine();

        evaluated = false;
        varEvaluated = false;

        exprString = exprCtx.getText();
    }

    @Override
    public void verify() {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.exprCtx);
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    @Override
    public void visitTerminal(TerminalNode node) {

    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

        if((ctx instanceof ExpressionContext) && !evaluated) {
            System.out.println("Expression Context " + ctx.getText());

            if (baracoValue.getPrimitiveType() == PrimitiveType.BOOL) {

                if (exprString.contains("!")) {
                    exprString = exprString.replaceAll("!", "not");
                    exprString = exprString.replaceAll("not=", "!=");
                }

                Expression exp = new Expression(exprString);

                try {
                    System.out.println(exp.eval().toString());
                    evaluated = true;
                } catch (NumberFormatException ex) {
                    evaluated = false;
                } catch (EmptyStackException ex) { // erase after aleviation
                    evaluated = false;
                }
            }

            String ctxString = ctx.getText();

            // START PRINTING ERRORS
            if (ctxString.contains(">") || ctxString.contains("<") || ctxString.contains("|") || ctxString.contains("&")) {
                if (baracoValue.getPrimitiveType() != PrimitiveType.BOOL) {
                    String additionalMessage = "Expected boolean.";
                    BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH, additionalMessage, this.lineNumber);
                }
            }
            // END PRINTING ERRORS
        }

        /*if(ctx instanceof LiteralContext) {
            System.out.println("Literal Context");
            if(this.baracoValue == null) {
                return;
            }
            LiteralContext literalCtx = (LiteralContext) ctx;
            String expressionString = literalCtx.getText();

            if(this.baracoValue.getPrimitiveType() == PrimitiveType.BOOL) {
                if(literalCtx.BooleanLiteral() == null) {
                    String additionalMessage = "Expected boolean.";
                    BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH,  additionalMessage, this.lineNumber);
                }
            }
            else if(this.baracoValue.getPrimitiveType() == PrimitiveType.INT) {
                if(literalCtx.IntegerLiteral() == null) {
                    String additionalMessage = "Expected int.";
                    BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH,  additionalMessage, this.lineNumber);
                }
            }
            else if(this.baracoValue.getPrimitiveType() == PrimitiveType.DECIMAL) {
                if(literalCtx.FloatingPointLiteral() == null) {
                    String additionalMessage = "Expected floating point or double.";
                    BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH,  additionalMessage, this.lineNumber);
                }
            }
            else if(this.baracoValue.getPrimitiveType() == PrimitiveType.STRING) {
                if(expressionString.charAt(0) != '\"' && expressionString.charAt(expressionString.length() - 1) != '\"') {
                    String additionalMessage = "Expected string.";
                    BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH,  additionalMessage, this.lineNumber);
                }

                else if(literalCtx.StringLiteral() == null) {
                    String additionalMessage = "Expected string.";
                    BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH,  additionalMessage, this.lineNumber);
                }
            }
        }*/
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    /*private void evaluateVariable (PrimaryContext pCtx) {
        BaracoValue baracoValue = VariableSearcher
                .searchVariable(pCtx.Identifier().getText());

        if (baracoValue.getValue() != null)

    } */

}
