package baraco.ide.dialogs;

import baraco.execution.commands.MethodList;
import baraco.templates.BaracoMethodTemplate;
import baraco.templates.BaracoMethodTemplateParameter;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.util.Optional;

public class GenerateMethodDialog {

    private static final String TYPE_VOID = "void";
    private static final String TYPE_STRING = "string";
    private static final String TYPE_INT = "int";
    private static final String TYPE_DECIMAL = "decimal";
    private static final String TYPE_BOOL = "bool";
    private static final String TYPE_STRING_ARRAY = "string[]";
    private static final String TYPE_INT_ARRAY = "int[]";
    private static final String TYPE_DECIMAL_ARRAY = "decimal[]";
    private static final String TYPE_BOOL_ARRAY = "bool[]";

    Dialog<String> dialog;

    public GenerateMethodDialog() {
        this.dialog = new Dialog<>();
        this.setupDialog();
    }

    private void setupDialog() {
        dialog.setTitle("Generate Method");
        dialog.setHeaderText(null);


        // Set the button types.
        ButtonType confirmButtonType = new ButtonType("Confirm", ButtonBar.ButtonData.FINISH);
        dialog.getDialogPane().getButtonTypes().addAll(ButtonType.CANCEL, confirmButtonType);

        // Create the username and password labels and fields.
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        TextField methodName = new TextField();
        methodName.setPromptText("Method Name");

        grid.add(new Label("Method Name:"), 0, 0);
        grid.add(methodName, 1, 0);

        Label errorMessageLabel = new Label("Method name exists!");
        errorMessageLabel.setTextFill(Color.RED);
        errorMessageLabel.setVisible(false);
        grid.add(errorMessageLabel, 2, 0);

        ObservableList<String> options =
                FXCollections.observableArrayList(
                        TYPE_VOID,
                        TYPE_STRING,
                        TYPE_INT,
                        TYPE_DECIMAL,
                        TYPE_BOOL,
                        TYPE_STRING_ARRAY,
                        TYPE_INT_ARRAY,
                        TYPE_DECIMAL_ARRAY,
                        TYPE_BOOL_ARRAY
                );
        ComboBox returnTypeComboBox = new ComboBox(options);
        returnTypeComboBox.getSelectionModel().selectFirst();

        grid.add(new Label("Return Type:"), 0, 1);
        grid.add(returnTypeComboBox, 1, 1);

        grid.add(new Label("Parameters:"), 0, 2);

        VBox parametersHolder = new VBox();
        parametersHolder.setPrefHeight(200);
        parametersHolder.setPrefWidth(350);
        ScrollPane parametersScroll = new ScrollPane(parametersHolder);
        parametersScroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        grid.add(parametersScroll, 0, 3, GridPane.REMAINING, 1);

        ObservableList<String> dataTypeOptions =
                FXCollections.observableArrayList(
                        TYPE_STRING,
                        TYPE_INT,
                        TYPE_DECIMAL,
                        TYPE_BOOL,
                        TYPE_STRING_ARRAY,
                        TYPE_INT_ARRAY,
                        TYPE_DECIMAL_ARRAY,
                        TYPE_BOOL_ARRAY
                );

        Button addButton = new Button("Add");
        addButton.setOnAction(event -> {
            ComboBox dataTypes = new ComboBox(dataTypeOptions);
            dataTypes.getSelectionModel().selectFirst();

            TextField parameterName = new TextField();
            parameterName.setPromptText("Parameter Name");

            Button removeButton = new Button("X");

            HBox parameters = new HBox(dataTypes, parameterName, removeButton);

            removeButton.setOnAction(value -> {
                parametersHolder.getChildren().remove(parameters);
            });

            parametersHolder.getChildren().add(parameters);
        });
        grid.add(addButton, 1, 2);


        // Enable/Disable login button depending on whether a username was entered.
        Node confirmButton = dialog.getDialogPane().lookupButton(confirmButtonType);
        confirmButton.setDisable(true);

        // Do some validation (using the Java 8 lambda syntax).
        methodName.textProperty().addListener((observable, oldValue, newValue) -> {
            boolean methodNameExists = MethodList.getInstance().methodNameExists(newValue);
            boolean invalid = newValue.trim().isEmpty() || methodNameExists;
            confirmButton.setDisable(invalid);
            errorMessageLabel.setVisible(methodNameExists);
        });

        dialog.getDialogPane().setContent(grid);

        // Request focus on the username field by default.
        Platform.runLater(() -> methodName.requestFocus());

        // Convert the result to a string
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == confirmButtonType) {
                // Create BaracoMethodTemplate then convert to string
                BaracoMethodTemplate methodTemplate = new BaracoMethodTemplate();
                methodTemplate.setMethodName(methodName.getText().trim());
                methodTemplate.setReturnType(returnTypeComboBox.getValue().toString());

                for (Node node : parametersHolder.getChildren()) {
                    HBox child = (HBox) node;

                    ObservableList<Node> parameterInfo = child.getChildren();

                    String parameterName = ((TextField) parameterInfo.get(1)).getText().trim();

                    if (parameterName.isEmpty()) {
                        continue;
                    }

                    String dataType = ((ComboBox) parameterInfo.get(0)).getValue().toString();
                    BaracoMethodTemplateParameter parameter = new BaracoMethodTemplateParameter(parameterName, dataType);

                    if (methodTemplate.hasParameter(parameter)) {
                        ErrorDialogHandler errorDialogHandler = new ErrorDialogHandler();
                        errorDialogHandler.showErrorDialog("Duplicate parameter! Try again!");
                        return null;
                    }

                    methodTemplate.addParameter(parameter);
                }

                return methodTemplate.toString();

            }
            return null;
        });
    }

    public String showGenerateMethodDialog() {
        Optional<String> result = dialog.showAndWait();

        return result.get();
    }
}
