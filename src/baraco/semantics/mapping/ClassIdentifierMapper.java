package baraco.semantics.mapping;

import baraco.antlr.parser.BaracoParser;
import baraco.builder.ParserHandler;
import baraco.representations.BaracoValue;
import baraco.semantics.symboltable.SymbolTableManager;
import baraco.semantics.symboltable.scopes.ClassScope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ClassIdentifierMapper implements ParseTreeListener, IValueMapper {

    private BaracoValue baracoValue;
    private String originalExp = null;
    private String modifiedExp = null;

    public ClassIdentifierMapper(String originalExp) {
        this.originalExp = originalExp;
        this.modifiedExp = originalExp;
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.semantics.mapping.IValueMapper#analyze(com.neildg.mobiprog.generatedexp.JavaParser.ExpressionContext)
     */
    @Override
    public void analyze(BaracoParser.ExpressionContext exprCtx) {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, exprCtx);
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.semantics.mapping.IValueMapper#analyze(com.neildg.mobiprog.generatedexp.JavaParser.ParExpressionContext)
     */
    @Override
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
                ClassScope classScope = SymbolTableManager.getInstance().getClassScope(ParserHandler.getInstance().getCurrentClassName());

                this.baracoValue = classScope.searchVariableIncludingLocal(variableKey);
                this.modifiedExp = this.modifiedExp.replace(variableKey, this.baracoValue.getValue().toString());
            }
        }
    }

    @Override
    public BaracoValue getBaracoValue() {
        return this.baracoValue;
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.semantics.mapping.IValueMapper#getOriginalExp()
     */
    @Override
    public String getOriginalExp() {
        return this.originalExp;
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.semantics.mapping.IValueMapper#getModifiedExp()
     */
    @Override
    public String getModifiedExp() {
        return this.modifiedExp;
    }

}
