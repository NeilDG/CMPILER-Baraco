package baraco.semantics.mapping;

import baraco.antlr.parser.BaracoParser;
import baraco.builder.ParserHandler;
import baraco.execution.ExecutionManager;
import baraco.execution.commands.EvaluationCommand;
import baraco.representations.BaracoArray;
import baraco.representations.BaracoMethod;
import baraco.representations.BaracoValue;
import baraco.representations.BaracoValueSearcher;
import baraco.semantics.symboltable.SymbolTableManager;
import baraco.semantics.symboltable.scopes.ClassScope;
import baraco.semantics.symboltable.scopes.LocalScope;
import baraco.semantics.symboltable.scopes.LocalScopeCreator;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MethodIdentifierMapper implements ParseTreeListener, IValueMapper {
    private final static String TAG = "MobiProg_FunctionIdentifierMapper";

    private String originalExp = null;
    private String modifiedExp = null;

    private BaracoMethod assignedFunction;
    private BaracoValue baracoValue;
    private LocalScope functionLocalScope;

    public MethodIdentifierMapper(String originalExp, BaracoMethod assignedFunction) {
        this.originalExp = originalExp;
        this.modifiedExp = originalExp;
        this.assignedFunction = assignedFunction;
        this.functionLocalScope = assignedFunction.getParentLocalScope();
    }

    public void analyze(BaracoParser.ExpressionContext exprCtx) {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, exprCtx);
    }

    public void analyze(BaracoParser.ParExpressionContext exprCtx) {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, exprCtx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        if(ctx instanceof BaracoParser.PrimaryContext) {
            BaracoParser.PrimaryContext primaryCtx = (BaracoParser.PrimaryContext) ctx;

            if(primaryCtx.Identifier() != null) {
                String variableKey = primaryCtx.getText();

                if (!EvaluationCommand.isArray(variableKey))
                    this.searchVariable(variableKey);
            }
        } else if (ctx instanceof BaracoParser.ExpressionContext) {

            BaracoParser.ExpressionContext exprCtx = (BaracoParser.ExpressionContext) ctx;

            if (exprCtx.expression().size() == 2) {
                if (EvaluationCommand.isArray(exprCtx.expression(0))) {
                    searchArray(exprCtx);
                }
            }

        }
    }

    private void searchVariable(String identifierString) {
        if(this.assignedFunction.hasParameter(identifierString)) {
            this.modifiedExp = this.modifiedExp.replace(identifierString, this.assignedFunction.getParameter(identifierString).getValue().toString());
        }
        else {
            this.baracoValue = LocalScopeCreator.searchVariableInLocalIterative(identifierString, this.functionLocalScope);

            if(this.baracoValue != null) {
                this.modifiedExp = this.modifiedExp.replace(identifierString, this.baracoValue.getValue().toString());
            }
            else {
                ClassScope classScope = SymbolTableManager.getInstance().getClassScope(ParserHandler.getInstance().getCurrentClassName());
                this.baracoValue = classScope.searchVariableIncludingLocal(identifierString);

                //Console.log("Variable in global scope: " +this.mobiValue.getValue());
                this.modifiedExp = this.modifiedExp.replace(identifierString, this.baracoValue.getValue().toString());
            }
        }
    }

    private void searchArray(BaracoParser.ExpressionContext exprCtx) {
        BaracoValue value = BaracoValueSearcher.searchBaracoValue(exprCtx.expression(0).getText());

        if (value != null) {
            if (value.getPrimitiveType() == BaracoValue.PrimitiveType.ARRAY) {

                BaracoArray baracoArray = (BaracoArray) value.getValue();

                EvaluationCommand evCmd = new EvaluationCommand(exprCtx.expression(1));
                evCmd.execute();

                ExecutionManager.getInstance().setCurrentCheckedLineNumber(exprCtx.getStart().getLine());
                BaracoValue arrayMobiValue = baracoArray.getValueAt(evCmd.getResult().intValue());

                if (arrayMobiValue == null)
                    return;

                if (arrayMobiValue.getPrimitiveType() == BaracoValue.PrimitiveType.STRING) {
                    //this.modifiedExp = this.modifiedExp.replaceFirst(exprCtx.expression(0).getText() + "\\[([a-zA-Z0-9]*)]", "\"" + arrayMobiValue.getValue().toString() + "\"");
                    this.modifiedExp = this.modifiedExp.replace(exprCtx.getText(), "\"" + arrayMobiValue.getValue().toString() + "\"");
                } else {
                    //this.modifiedExp = this.modifiedExp.replaceFirst(exprCtx.expression(0).getText() + "\\[([a-zA-Z0-9]*)]", arrayMobiValue.getValue().toString());
                    this.modifiedExp = this.modifiedExp.replace(exprCtx.expression(0).getText() + "[" + evCmd.getResult().intValue() + "]", arrayMobiValue.getValue().toString());
                }

            }
        }

    }

    @Override
    public BaracoValue getBaracoValue() {
        return this.baracoValue;
    }

    @Override
    public String getOriginalExp() {
        return this.originalExp;
    }

    @Override
    public String getModifiedExp() {
        return this.modifiedExp;
    }
}