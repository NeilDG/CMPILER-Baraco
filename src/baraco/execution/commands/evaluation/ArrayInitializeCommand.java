package baraco.execution.commands.evaluation;

import baraco.antlr.parser.BaracoParser;
import baraco.execution.commands.EvaluationCommand;
import baraco.execution.commands.ICommand;
import baraco.representations.BaracoArray;

public class ArrayInitializeCommand implements ICommand {

    private BaracoArray assignedBaracoArray;
    private BaracoParser.ArrayCreatorRestContext arrayCreatorCtx;

    public ArrayInitializeCommand(BaracoArray baracoArray, BaracoParser.ArrayCreatorRestContext arrayCreatorCtx) {
        this.assignedBaracoArray = baracoArray;
        this.arrayCreatorCtx = arrayCreatorCtx;
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.execution.commands.ICommand#execute()
     */
    @Override
    public void execute() {
        BaracoParser.ExpressionContext exprCtx = this.arrayCreatorCtx.expression(0);

        if(exprCtx != null) {
            EvaluationCommand evaluationCommand = new EvaluationCommand(exprCtx);
            evaluationCommand.execute();

            this.assignedBaracoArray.initializeSize(evaluationCommand.getResult().intValue());
        }

    }
}
