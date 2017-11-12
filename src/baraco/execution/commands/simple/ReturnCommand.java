package baraco.execution.commands.simple;

import baraco.builder.errorcheckers.TypeChecker;
import baraco.builder.errorcheckers.UndeclaredChecker;
import baraco.execution.commands.EvaluationCommand;
import baraco.execution.commands.ICommand;
import baraco.antlr.parser.BaracoParser.*;
import baraco.representations.BaracoMethod;
import baraco.representations.BaracoValue;
import baraco.semantics.utils.AssignmentUtils;

public class ReturnCommand implements ICommand {
    private final static String TAG = "MobiProg_ReturnCommand";

    private ExpressionContext expressionCtx;
    private BaracoMethod assignedBaracoMethod;

    public ReturnCommand(ExpressionContext expressionCtx, BaracoMethod baracoMethod) {
        this.expressionCtx = expressionCtx;
        this.assignedBaracoMethod = baracoMethod;

        UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.expressionCtx);
        undeclaredChecker.verify();

        BaracoValue baracoValue = this.assignedBaracoMethod.getReturnValue();
        TypeChecker typeChecker = new TypeChecker(baracoValue, this.expressionCtx);
        typeChecker.verify();
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.execution.commands.ICommand#execute()
     */
    @Override
    public void execute() {
        EvaluationCommand evaluationCommand = new EvaluationCommand(this.expressionCtx);
        evaluationCommand.execute();

        BaracoValue baracoValue = this.assignedBaracoMethod.getReturnValue();

        AssignmentUtils.assignAppropriateValue(baracoValue, evaluationCommand.getResult());
        //Console.log(LogType.DEBUG,"Return value is: " +evaluationCommand.getResult().toEngineeringString());
    }

}
