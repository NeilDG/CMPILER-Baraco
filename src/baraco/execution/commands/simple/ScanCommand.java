package baraco.execution.commands.simple;

import baraco.execution.ExecutionManager;
import baraco.execution.commands.ICommand;
import baraco.representations.BaracoValue;
import baraco.representations.BaracoValueSearcher;
import baraco.semantics.utils.StringUtils;
import baraco.utils.notifications.*;

public class ScanCommand implements ICommand, NotificationListener {

    //private final static String TAG = "MobiProg_ScanCommand";

    private String messageToDisplay;
    private String identifier;

    private int called = 0;

    public ScanCommand(String messageToDisplay, String identifier) {
        this.messageToDisplay = StringUtils.removeQuotes(messageToDisplay);
        this.identifier = identifier;

    }
    @Override
    public void execute() {
        called++;

        if(called % 2 == 1) {
            NotificationCenter.getInstance().addObserver(Notifications.ON_SCAN_DIALOG_DISMISSED, this); //add an observer to listen to when the dialog has been dismissed

            Parameters params = new Parameters();
            params.putExtra(KeyNames.MESSAGE_DISPLAY_KEY, this.messageToDisplay);

            ExecutionManager.getInstance().blockExecution();
            NotificationCenter.getInstance().postNotification(Notifications.ON_FOUND_SCAN_STATEMENT, params);
        }
    }

    private void acquireInputFromUser(Parameters params) {
        String valueEntered = params.getStringExtra(KeyNames.VALUE_ENTERED_KEY, "");

        System.out.println("VALUE ENTERED: " + valueEntered);

        BaracoValue baracoValue = BaracoValueSearcher.searchBaracoValue(identifier);
        baracoValue.setValue(valueEntered);

        NotificationCenter.getInstance().removeObserver(Notifications.ON_SCAN_DIALOG_DISMISSED, this); //remove observer after using
        ExecutionManager.getInstance().resumeExecution(); //resume execution of thread
    }

    @Override
    public void onNotify(String notificationString, Parameters params) {
        if(notificationString == Notifications.ON_SCAN_DIALOG_DISMISSED) {
            this.acquireInputFromUser(params);
        }
    }
}
