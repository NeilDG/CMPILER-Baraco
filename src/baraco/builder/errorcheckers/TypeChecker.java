/**
 *
 */
package baraco.builder.errorcheckers;

import baraco.antlr.parser.BaracoParser.ExpressionContext;
import baraco.antlr.parser.BaracoParser.LiteralContext;
import baraco.builder.BuildChecker;
import baraco.builder.ErrorRepository;
import baraco.builder.ParserHandler;
import baraco.execution.commands.EvaluationCommand;
import baraco.representations.BaracoMethod;
import baraco.representations.BaracoValue;
import baraco.representations.BaracoValue.PrimitiveType;
import baraco.semantics.symboltable.SymbolTableManager;
import baraco.semantics.symboltable.scopes.ClassScope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Handles all the type checking
 * @author NeilDG
 *
 */
public class TypeChecker implements IErrorChecker, ParseTreeListener {

    private BaracoValue baracoValue;
    private ExpressionContext exprCtx;
    private int lineNumber;

    public TypeChecker(BaracoValue assignmentMobiValue, ExpressionContext exprCtx) {
        this.baracoValue = assignmentMobiValue;
        this.exprCtx = exprCtx;

        Token firstToken = exprCtx.getStart();
        this.lineNumber = firstToken.getLine();
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
        if(ctx instanceof ExpressionContext) {

            ExpressionContext expCtx = (ExpressionContext) ctx;

            if (EvaluationCommand.isFunctionCall(exprCtx)){

                ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
                        ParserHandler.getInstance().getCurrentClassName());
                BaracoMethod baracoMethod = classScope.searchMethod(expCtx.getText());

                if(baracoValue == null)
                    return;

                if(baracoMethod == null)
                    return;

                if(this.baracoValue.getPrimitiveType() == PrimitiveType.BOOL) {
                    if(baracoMethod.getReturnType() != BaracoMethod.MethodType.BOOL_TYPE) {
                        String additionalMessage = "Expected boolean.";
                        BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH,  additionalMessage, this.lineNumber);
                    }
                }
                else if(this.baracoValue.getPrimitiveType() == PrimitiveType.INT) {
                    if(baracoMethod.getReturnType() != BaracoMethod.MethodType.INT_TYPE) {
                        String additionalMessage = "Expected int.";
                        BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH,  additionalMessage, this.lineNumber);
                    }
                }
                else if(this.baracoValue.getPrimitiveType() == PrimitiveType.DECIMAL) {
                    if(baracoMethod.getReturnType() != BaracoMethod.MethodType.DECIMAL_TYPE) {
                        String additionalMessage = "Expected floating point or double.";
                        BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH,  additionalMessage, this.lineNumber);
                    }
                }
                else if(this.baracoValue.getPrimitiveType() == PrimitiveType.STRING) {
                    if (baracoMethod.getReturnType() != BaracoMethod.MethodType.STRING_TYPE) {
                        String additionalMessage = "Expected string.";
                        BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH, additionalMessage, this.lineNumber);
                    }
                }

            }
            else {
                EvaluationCommand evaluationCommand = new EvaluationCommand(expCtx);
                evaluationCommand.execute();

                if(this.baracoValue.getPrimitiveType() == PrimitiveType.BOOL) {
                    if(!evaluationCommand.getModifiedExp().equals("true") && !evaluationCommand.getStringResult().equals("false")) {
                        String additionalMessage = "Expected boolean.";
                        BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH,  additionalMessage, this.lineNumber);
                    }
                }
                else if(this.baracoValue.getPrimitiveType() == PrimitiveType.INT) {
                    if(!this.isInteger(evaluationCommand.getModifiedExp())) {
                        String additionalMessage = "Expected int.";
                        BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH,  additionalMessage, this.lineNumber);
                    }
                }
                else if(this.baracoValue.getPrimitiveType() == PrimitiveType.DECIMAL) {
                    if(!this.isDecimal(evaluationCommand.getModifiedExp())) {
                        String additionalMessage = "Expected floating point or double.";
                        BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH,  additionalMessage, this.lineNumber);
                    }
                }
                else if(this.baracoValue.getPrimitiveType() == PrimitiveType.STRING) {
                    if(evaluationCommand.isNumericResult()){
                        String additionalMessage = "Expected string.";
                        BuildChecker.reportCustomError(ErrorRepository.TYPE_MISMATCH,  additionalMessage, this.lineNumber);
                    }
                }
            }

        } /*else if(ctx instanceof LiteralContext) {
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

    private boolean isInteger(String text) {
        try{
            Integer.parseInt(text);

            if(text.charAt(0) != '\"' && text.charAt(text.length() - 1) != '\"' && !text.contains("."))
                return true;
        }
        catch (Exception e) {
            return false;
        }

        return false;
    }

    private boolean isDecimal(String text) {
        try {
            Float.parseFloat(text);

            if(text.charAt(0) != '\"' && text.charAt(text.length() - 1) != '\"' && text.contains("."))
                return true;
        }
        catch(Exception e) {
            return false;
        }

        return false;
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

}
