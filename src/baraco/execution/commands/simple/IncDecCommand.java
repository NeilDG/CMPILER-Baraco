package baraco.execution.commands.simple;

import baraco.antlr.lexer.BaracoLexer;
import baraco.execution.commands.ICommand;
import baraco.antlr.parser.BaracoParser.*;
import baraco.representations.BaracoValue;
import baraco.semantics.mapping.IValueMapper;
import baraco.semantics.mapping.IdentifierMapper;

public class IncDecCommand implements ICommand {

    private ExpressionContext exprCtx;
    private int tokenSign;

    public IncDecCommand(ExpressionContext exprCtx, int tokenSign) {
        this.exprCtx = exprCtx;
        this.tokenSign = tokenSign;
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.execution.commands.ICommand#execute()
     */
    @Override
    public void execute() {
        //String identifier = this.exprCtx.primary().Identifier().getText();
        //MobiValue mobiValue = MobiValueSearcher.searchMobiValue(identifier);

        IValueMapper leftHandMapper = new IdentifierMapper(
                this.exprCtx.getText());
        leftHandMapper.analyze(this.exprCtx);

        BaracoValue baracoValue = leftHandMapper.getBaracoValue();

        this.performOperation(baracoValue);
    }

    /*
     * Attempts to perform an increment/decrement operation
     */
    private void performOperation(BaracoValue baracoValue) {
        if(baracoValue.getPrimitiveType() == BaracoValue.PrimitiveType.INT) {
            int value = Integer.valueOf(baracoValue.getValue().toString());

            if(this.tokenSign == BaracoLexer.INC) {
                value++;
                baracoValue.setValue(String.valueOf(value));
            }
            else if(this.tokenSign == BaracoLexer.DEC) {
                value--;
                baracoValue.setValue(String.valueOf(value));
            }
        }
        else if(baracoValue.getPrimitiveType() == BaracoValue.PrimitiveType.DECIMAL) {
            float value = Float.valueOf(baracoValue.getValue().toString());

            if(this.tokenSign == BaracoLexer.INC) {
                value++;
                baracoValue.setValue(String.valueOf(value));
            }
            else if(this.tokenSign == BaracoLexer.DEC) {
                value--;
                baracoValue.setValue(String.valueOf(value));
            }
        }
    }

}
