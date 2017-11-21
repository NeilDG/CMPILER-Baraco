package baraco.ide;

import baraco.execution.ExecutionManager;
import baraco.execution.ExecutionMonitor;
import baraco.utils.notifications.*;
import javafx.application.Platform;
import javafx.scene.control.TextInputDialog;

import javax.swing.text.html.Option;
import java.util.ConcurrentModificationException;
import java.util.Optional;

import static baraco.utils.notifications.KeyNames.VALUE_ENTERED_KEY;

public class ScanDialogHandler implements NotificationListener {

    TextInputDialog dialog;

    public ScanDialogHandler() {
        dialog = new TextInputDialog();
        dialog.setTitle("Scan Dialog");
        //dialog.setContentText("Please enter your name:");

        NotificationCenter.getInstance().addObserver(Notifications.ON_FOUND_SCAN_STATEMENT, this);
    }

    private void showScanDialog(Parameters params) throws InterruptedException {
        dialog.setContentText(params.getStringExtra(KeyNames.MESSAGE_DISPLAY_KEY, "Input: "));

        // Traditional way to get the response value.
        Platform.runLater(()-> {

                Optional<String> result = dialog.showAndWait();

                if (result.isPresent()){
                    Parameters parameters = new Parameters();
                    parameters.putExtra(VALUE_ENTERED_KEY, result.get());
                    
                    NotificationCenter.getInstance().postNotification(Notifications.ON_SCAN_DIALOG_DISMISSED, parameters); //report back results to scan command

                } else {
                    NotificationCenter.getInstance().postNotification(Notifications.ON_SCAN_DIALOG_DISMISSED); //report back results to scan command
                }

        });


    }


    @Override
    public void onNotify(String notificationString, Parameters params) {

        if(notificationString == Notifications.ON_FOUND_SCAN_STATEMENT) {
            try {
                this.showScanDialog(params);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
