package baraco.semantics.utils;

import baraco.execution.commands.ICommand;
import baraco.execution.commands.controlled.DoWhileCommand;
import baraco.execution.commands.controlled.ForCommand;
import baraco.execution.commands.controlled.IfCommand;
import baraco.execution.commands.controlled.WhileCommand;
import baraco.execution.commands.evaluation.AssignmentCommand;
import baraco.execution.commands.evaluation.MappingCommand;
import baraco.execution.commands.simple.IncDecCommand;

import java.util.ArrayList;

public class LocalVarTracker {

    public static void populateLocalVars(ArrayList<String> localVars, ICommand command) {
        if (command instanceof MappingCommand) {
            localVars.add(((MappingCommand) command).getIdentifierString());
        } else if (command instanceof AssignmentCommand) {
            if (!((AssignmentCommand) command).isLeftHandArrayAccessor())
                localVars.add(((AssignmentCommand) command).getLeftHandExprCtx().getText());
        } else if (command instanceof IncDecCommand) {
            localVars.add(((IncDecCommand) command).getIdentifierString());
        } else if (command instanceof ForCommand) {
            localVars.addAll(((ForCommand) command).getLocalVars());
        } else if (command instanceof WhileCommand) {

            if (command instanceof DoWhileCommand) {
                localVars.addAll(((DoWhileCommand) command).getLocalVars());
            } else {
                localVars.addAll(((WhileCommand) command).getLocalVars());
            }

        } else if (command instanceof IfCommand) {
            localVars.addAll(((IfCommand) command).getLocalVars());
        }
    }

    public static void resetLocalVars(ArrayList<String> localVars) {
        localVars.removeAll(localVars);
    }


}
