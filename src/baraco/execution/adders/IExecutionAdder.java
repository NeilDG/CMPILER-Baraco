package baraco.execution.adders;

import baraco.execution.commands.ICommand;

public interface IExecutionAdder {
    public abstract void addCommand(ICommand command);
}
