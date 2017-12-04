package baraco.execution;

import baraco.builder.BuildChecker;
import baraco.builder.ErrorRepository;
import baraco.execution.adders.IExecutionAdder;
import baraco.execution.adders.MainExecutionAdder;
import baraco.execution.adders.MethodExecutionAdder;
import baraco.execution.commands.ICommand;
import baraco.execution.commands.controlled.IAttemptCommand;
import baraco.representations.BaracoMethod;
import baraco.utils.notifications.NotificationCenter;
import baraco.utils.notifications.Notifications;
import baraco.utils.notifications.Parameters;
import baraco.utils.notifications.NotificationListener;

import java.util.ArrayList;

public class ExecutionManager implements NotificationListener {

    private final static String TAG = "ExecutionManager";

    private static ExecutionManager sharedInstance = null;

    public static ExecutionManager getInstance() {
        return sharedInstance;
    }

    private ArrayList<ICommand> executionList = new ArrayList<ICommand>();
    private boolean foundEntryPoint = false;
    private String entryClassName = null;

    private ExecutionThread executionThread;
    private ExecutionMonitor executionMonitor;

    private IExecutionAdder activeExecutionAdder;
    private MainExecutionAdder mainExecutionAdder;

    private IAttemptCommand.CatchTypeEnum currentCatchType = null;
    private IAttemptCommand currentTryCommand = null;

    private ExecutionManager() {
        this.mainExecutionAdder = new MainExecutionAdder(this.executionList);
        this.activeExecutionAdder = this.mainExecutionAdder;
    }

    public static void initialize() {
        sharedInstance = new ExecutionManager();
        NotificationCenter.getInstance().addObserver(Notifications.ON_EXECUTION_FINISHED, sharedInstance);
    }

    public static void reset() {
        sharedInstance.foundEntryPoint = false;
        sharedInstance.entryClassName = null;
        sharedInstance.clearAllActions();

        NotificationCenter.getInstance().removeObserver(Notifications.ON_EXECUTION_FINISHED, sharedInstance);
    }

    public IAttemptCommand getCurrentTryCommand() {
        return this.currentTryCommand;
    }

    public void setCurrentTryCommand(IAttemptCommand command) {
        this.currentTryCommand = command;
    }

    public IAttemptCommand.CatchTypeEnum getCurrentCatchType() {
        return this.currentCatchType;
    }

    public void setCurrentCatchType(IAttemptCommand.CatchTypeEnum catchType) {

        if (this.currentTryCommand != null)
            this.currentCatchType = catchType;
        else {

            if (catchType == IAttemptCommand.CatchTypeEnum.ARRAY_OUT_OF_BOUNDS) {
                BuildChecker.reportCustomError(ErrorRepository.RUNTIME_ARRAY_OUT_OF_BOUNDS, "");
            } else if (catchType == IAttemptCommand.CatchTypeEnum.NEGATIVE_ARRAY_SIZE) {
                BuildChecker.reportCustomError(ErrorRepository.RUNTIME_NEGATIVE_ARRAY_SIZE, "");
            } else if (catchType == IAttemptCommand.CatchTypeEnum.ARITHMETIC_EXCEPTION) {
                BuildChecker.reportCustomError(ErrorRepository.RUNTIME_ARITHMETIC_EXCEPTION, "");
            }

            this.clearAllActions();
        }
    }

    /*
	 * Reported by the parser walker if void main() has been found which means that an entry point for execution has been found.
	 * Required the class name in which main() has been found
	 */
    public void reportFoundEntryPoint(String entryClassName) {
        this.entryClassName = entryClassName;
        this.foundEntryPoint = true;
    }

    public boolean hasFoundEntryPoint() {
        return this.foundEntryPoint;
    }

    public String getEntryClassName() {
        return this.entryClassName;
    }

    public void addCommand(ICommand command) {
        this.activeExecutionAdder.addCommand(command);
    }

    /*
     * Deletes a command from the main control flow
     */
    public void deleteCommand(ICommand command) {
        this.executionList.remove(command);
    }

    /*
     * Opens a function. Any succeeding commands to be added will be put to the function control flow.
     */
    public void openFunctionExecution(BaracoMethod mobiFunction) {
        MethodExecutionAdder methodExecutionAdder = new MethodExecutionAdder(mobiFunction);
        this.activeExecutionAdder = methodExecutionAdder;
    }

    /*
     * Returns true if the execution manager currently points to a function control flow.
     */
    public boolean isInFunctionExecution() {
        return (this.activeExecutionAdder instanceof MethodExecutionAdder);
    }

    /*
     * Returns the current function that the execution manager is populating.
     */
    public BaracoMethod getCurrentFunction() {
        if(this.isInFunctionExecution()) {
            MethodExecutionAdder functionExecAdder = (MethodExecutionAdder) this.activeExecutionAdder;

            return functionExecAdder.getAssignedFunction();
        }
        else {
            System.out.println(TAG + ": " + "Execution manager is not in a function!");
            return null;
        }
    }

    /*
     * Closes a function. Control flow will be given back to the main execution adder.
     */
    public void closeFunctionExecution() {
        this.activeExecutionAdder = this.mainExecutionAdder;
    }

    /*
     * Blocks the execution of the thread. Can only be called once. At this point, resumeExecution() must be called by a specific command.
     */
    public void blockExecution() {
        this.executionMonitor.claimExecutionFlag();
    }

    /*
     * Resumes the execution of thread. Can only be called once. At this point, the execution thread should continue to do other actions.
     */
    public void resumeExecution() {
        this.executionMonitor.releaseExecutionFlag();
    }

    /*
     * Spawns a worker thread to handle execution of actions. A semaphore flag is included that may attempt to be claimed by specific commands (like SCAN statement).
     * This causes the execution thread to temporarily halt until released.
     */
    public void executeAllActions() {
        this.executionMonitor = new ExecutionMonitor();
        this.executionThread = new ExecutionThread(this.executionList, this.executionMonitor);
        this.executionThread.start();
    }

    public void clearAllActions() {
        this.executionList.clear();
    }

    /*
     * Gets the execution monitor. This is used for controlled commands that also needs to check prior to execution.
     */
    public ExecutionMonitor getExecutionMonitor() {
        return this.executionMonitor;
    }

    @Override
    public void onNotify(String notificationString, Parameters params) {
        if(notificationString == Notifications.ON_EXECUTION_FINISHED) {
            //SymbolTableManager.getInstance().resetClassTables(); //TODO: does not work as intended
        }
    }
}
