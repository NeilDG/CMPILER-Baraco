package baraco.execution.commands.controlled;

import baraco.execution.commands.ICommand;

public interface IAttemptCommand extends ICommand {

    public enum CatchTypeEnum {
        ARRAY_OUT_OF_BOUNDS,
        NEGATIVE_ARRAY_SIZE,
        ARITHMETIC_EXCEPTION
    }

    public abstract IControlledCommand.ControlTypeEnum getControlType();
    public abstract void addTryCommand(ICommand command);
    public abstract void addCatchCommand(CatchTypeEnum catchTypeEnum, ICommand command);
    public abstract boolean hasCatchFor(CatchTypeEnum catchTypeEnum);

}
