package baraco.execution.commands.controlled;

import baraco.execution.ExecutionManager;
import baraco.execution.ExecutionMonitor;
import baraco.execution.commands.ICommand;
import baraco.semantics.statements.StatementControlOverseer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TryCommand implements IAttemptCommand {

    private List<ICommand> tryCommands; //list of commands to execute if the condition holds true
    private HashMap<CatchTypeEnum, List<ICommand>> catchCommands; //list of commands to execute if the condition holds false

    @Override
    public IControlledCommand.ControlTypeEnum getControlType() {
        return IControlledCommand.ControlTypeEnum.TRY_COMMAND;
    }

    public TryCommand() {
        this.tryCommands = new ArrayList<>();
        this.catchCommands = new HashMap<CatchTypeEnum, List<ICommand>>();
    }

    @Override
    public void addTryCommand(ICommand command) {
        tryCommands.add(command);
    }

    @Override
    public void addCatchCommand(CatchTypeEnum catchTypeEnum, ICommand command) {

        List<ICommand> commandList;

        if (catchCommands.containsKey(catchTypeEnum)) {
            commandList = catchCommands.get(catchTypeEnum);
        } else {
            commandList = new ArrayList<>();
        }

        commandList.add(command);

        catchCommands.put(catchTypeEnum, commandList);
    }

    @Override
    public void execute() {

        ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();
        ExecutionManager.getInstance().setCurrentTryCommand(this);

        try {
            for (ICommand command: tryCommands) {
                executionMonitor.tryExecution();
                command.execute();

                if (ExecutionManager.getInstance().getCurrentCatchType() != null)
                    break;
            }


            if (ExecutionManager.getInstance().getCurrentCatchType() != null) {

                if (catchCommands.get(ExecutionManager.getInstance().getCurrentCatchType()) != null) {
                    for (ICommand command : catchCommands.get(ExecutionManager.getInstance().getCurrentCatchType())) {
                        executionMonitor.tryExecution();
                        command.execute();
                    }
                }

                ExecutionManager.getInstance().setCurrentCatchType(null);
                ExecutionManager.getInstance().setCurrentTryCommand(null);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
