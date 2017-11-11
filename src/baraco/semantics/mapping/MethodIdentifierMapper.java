package baraco.semantics.mapping;

import baraco.antlr.parser.BaracoParser;
import baraco.builder.ParserHandler;
import baraco.representations.BaracoMethod;
import baraco.representations.BaracoValue;
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
                this.searchVariable(variableKey);
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