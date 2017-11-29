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
import java.util.Stack;

public class LocalVarTracker {

    private static LocalVarTracker sharedInstance = null;

    private Stack<ArrayList<String>> sessions;

    public static LocalVarTracker getInstance() {
        return sharedInstance;
    }

    public static void initialize() {
        sharedInstance = new LocalVarTracker();
    }

    public static void reset() {

    }

    public LocalVarTracker () {
        sessions = new Stack<ArrayList<String>>();
    }

    public void populateLocalVars(ICommand command) {

        if (!sessions.isEmpty()) {

            if (command instanceof MappingCommand) {
                sessions.peek().add(((MappingCommand) command).getIdentifierString());
            } else if (command instanceof AssignmentCommand) {
                if (!((AssignmentCommand) command).isLeftHandArrayAccessor())
                    sessions.peek().add(((AssignmentCommand) command).getLeftHandExprCtx().getText());
            } else if (command instanceof IncDecCommand) {
                sessions.peek().add(((IncDecCommand) command).getIdentifierString());
            } else if (command instanceof ForCommand) {
                sessions.peek().addAll(((ForCommand) command).getLocalVars());

                resetLocalVars(((ForCommand) command).getLocalVars());
            } else if (command instanceof WhileCommand) {

                if (command instanceof DoWhileCommand) {
                    sessions.peek().addAll(((DoWhileCommand) command).getLocalVars());
                } else {
                    sessions.peek().addAll(((WhileCommand) command).getLocalVars());
                }

                resetLocalVars(((WhileCommand) command).getLocalVars());


            } else if (command instanceof IfCommand) {
                sessions.peek().addAll(((IfCommand) command).getLocalVars());

                resetLocalVars(((IfCommand) command).getLocalVars());
            }

        }

    }

    public static void resetLocalVars(ArrayList<String> localVars) {
        localVars.clear();
    }

    public void startNewSession() {
        sessions.push(new ArrayList<String>());
    }

    public ArrayList<String> getCurrentSession() {
        return sessions.peek();
    }

    public ArrayList<String> endCurrentSession() {
        return sessions.pop();
    }

}
