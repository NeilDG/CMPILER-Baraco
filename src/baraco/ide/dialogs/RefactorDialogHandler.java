package baraco.ide.dialogs;

import baraco.utils.notifications.NotificationCenter;
import baraco.utils.notifications.Notifications;
import baraco.utils.notifications.Parameters;
import javafx.scene.control.TextInputDialog;

import java.util.ConcurrentModificationException;
import java.util.Optional;

import static baraco.utils.notifications.KeyNames.VALUE_ENTERED_KEY;

public class RefactorDialogHandler {

    TextInputDialog dialog;

    public RefactorDialogHandler() {
        dialog = new TextInputDialog();
        dialog.setTitle("Refactor");
    }

    public String showRefactorDialog(String originalName) {
        dialog.setContentText("Set new name for method \"" + originalName + "\":");

        Optional<String> result = dialog.showAndWait();

        if (result.isPresent() && !result.get().isEmpty()) {
            return result.get();
        }

        return null;
    }
}
