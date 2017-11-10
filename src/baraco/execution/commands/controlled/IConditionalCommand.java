package baraco.execution.commands.controlled;

import baraco.execution.commands.ICommand;

public interface IConditionalCommand extends ICommand {

    public abstract IControlledCommand.ControlTypeEnum getControlType();
    public abstract void addPositiveCommand(ICommand command);
    public abstract void addNegativeCommand(ICommand command);
}
