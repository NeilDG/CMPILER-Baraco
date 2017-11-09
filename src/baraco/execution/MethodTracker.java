package baraco.execution;

import baraco.representations.BaracoMethod;

import java.util.Stack;

public class MethodTracker {

    private final static String TAG = "MethodTracker";

    private static MethodTracker sharedInstance = null;

    private Stack<BaracoMethod> callStack;

    public static MethodTracker getInstance() {
        return sharedInstance;
    }

    private MethodTracker() {
        this.callStack = new Stack<BaracoMethod>();
    }

    public static void initialize() {
        sharedInstance = new MethodTracker();
    }

    public static void reset() {

    }

    public void reportEnterFunction(BaracoMethod baracoMethod) {
        this.callStack.push(baracoMethod);
    }

    public void reportExitFunction() {
        this.callStack.pop();
    }

    public BaracoMethod getLatestFunction() {
        return this.callStack.peek();
    }

    /*
     * Returns true if the control flow is currently inside a function
     */
    public boolean isInsideFunction() {
        return (this.callStack.size() != 0);
    }
}
