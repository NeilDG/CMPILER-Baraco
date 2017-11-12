package baraco.ide;

import baraco.utils.notifications.*;
import javafx.scene.control.TextInputDialog;

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

    private void showScanDialog(Parameters params) {
        dialog.setContentText(params.getStringExtra(KeyNames.MESSAGE_DISPLAY_KEY, "Input: "));

        // Traditional way to get the response value.
        Optional<String> result = dialog.showAndWait();

        if (result.isPresent()){
            //System.out.println("Your name: " + result.get());
            Parameters parameters = new Parameters();
            params.putExtra(VALUE_ENTERED_KEY, result.get());

            NotificationCenter.getInstance().postNotification(Notifications.ON_SCAN_DIALOG_DISMISSED, parameters); //report back results to scan command
        }
    }


    @Override
    public void onNotify(String notificationString, Parameters params) {

        if(notificationString == Notifications.ON_FOUND_SCAN_STATEMENT) {
            this.showScanDialog(params);
        }
    }
}
