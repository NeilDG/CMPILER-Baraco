package baraco.execution.commands.controlled;

import baraco.antlr.parser.BaracoParser;
import baraco.execution.ExecutionManager;
import baraco.execution.ExecutionMonitor;
import baraco.execution.commands.ICommand;
import baraco.semantics.utils.LocalVarTracker;

public class DoWhileCommand extends WhileCommand {

    public DoWhileCommand(BaracoParser.ParExpressionContext parExprCtr) {
        super(parExprCtr);
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.execution.commands.ICommand#execute()
     */
    @Override
    public void execute() {
        this.executeFirstCommandSequence();
        super.execute();
    }

    /*
     * Executes the first command sequence before actually executing the behavior for the while command
     */
    private void executeFirstCommandSequence() {
        this.identifyVariables();

        ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();

        LocalVarTracker.resetLocalVars(super.getLocalVars());

        try {
            for(ICommand command : this.commandSequences) {
                executionMonitor.tryExecution();
                command.execute();

                LocalVarTracker.populateLocalVars(super.getLocalVars(), command);
            }

        } catch(InterruptedException e) {
            //Log.e(TAG, "Monitor block interrupted! " +e.getMessage());
            System.out.println("DoWhileCommand: Monitor block interrupted! " + e.getMessage());
        }
    }

    @Override
    public ControlTypeEnum getControlType() {
        return ControlTypeEnum.DO_WHILE_CONTROL;
    }
}
