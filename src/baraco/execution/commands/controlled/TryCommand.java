package baraco.execution.commands.controlled;

import baraco.execution.ExecutionManager;
import baraco.execution.ExecutionMonitor;
import baraco.execution.commands.ICommand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TryCommand implements IAttemptCommand {

    private List<ICommand> tryCommands; //list of commands to execute if the condition holds true
    private HashMap<CatchTypeEnum, List<ICommand>> catchCommands; //list of commands to execute if the condition holds false

    private boolean trying = true;

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

        /*ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();

        try {
            for (ICommand command: tryCommands) {
                executionMonitor.tryExecution();
                command.execute();

                if (!trying)
                    break;
            }

            if (!trying) {
                trying = false;

                for (CatchTypeEnum catchTypeEnum: catchCommands.keySet()) {
                    for (ICommand command:
                         catchCommands.get(catchTypeEnum)) {

                        executionMonitor.tryExecution();
                        command.execute();

                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

    }

    public void setTrying(boolean bool) {
        trying = bool;
    }

    public boolean isTrying(){
        return trying;
    }
}
