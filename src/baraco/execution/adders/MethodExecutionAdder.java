package baraco.execution.adders;

import baraco.execution.commands.ICommand;
import baraco.representations.BaracoMethod;

public class MethodExecutionAdder implements IExecutionAdder {

    private BaracoMethod assignedMobiFunction;

    public MethodExecutionAdder(BaracoMethod mobiFunction) {
        this.assignedMobiFunction = mobiFunction;
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.execution.adders.IExecutionAdder#addCommand(com.neildg.mobiprog.execution.commands.ICommand)
     */
    @Override
    public void addCommand(ICommand command) {
        this.assignedMobiFunction.addCommand(command);
    }

    public BaracoMethod getAssignedFunction() {
        return this.assignedMobiFunction;
    }
}

