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

import java.util.ArrayList;
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

    private Dialog<String> dialog;
    private VBox parametersHolder;
    private TextField methodName;
    private TextArea sampleArea;
    private ComboBox<String> returnTypeComboBox;
    private RadioButton publicRadio;
    private RadioButton privateRadio;

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

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        ToggleGroup radioButtons = new ToggleGroup();
        publicRadio = new RadioButton("public");
        publicRadio.setToggleGroup(radioButtons);
        publicRadio.setSelected(true);
        publicRadio.setOnAction(event -> {
            updateSampleArea();
        });
        privateRadio = new RadioButton("private");
        privateRadio.setToggleGroup(radioButtons);
        privateRadio.setOnAction(event -> {
            updateSampleArea();
        });

        HBox radioButtonHolder = new HBox(10);
        radioButtonHolder.getChildren().addAll(publicRadio, privateRadio);

        grid.add(radioButtonHolder, 0, 0);

        methodName = new TextField();
        methodName.setPromptText("Method Name");

        grid.add(new Label("Method Name:"), 0, 1);
        grid.add(methodName, 1, 1);

        Label errorMessageLabel = new Label("Method name exists!");
        errorMessageLabel.setTextFill(Color.RED);
        errorMessageLabel.setVisible(false);
        grid.add(errorMessageLabel, 2, 1);

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
        returnTypeComboBox = new ComboBox(options);
        returnTypeComboBox.getSelectionModel().selectFirst();
        returnTypeComboBox.setOnAction(event -> {
            updateSampleArea();
        });

        grid.add(new Label("Return Type:"), 0, 2);
        grid.add(returnTypeComboBox, 1, 2);

        grid.add(new Label("Parameters:"), 0, 3);

        parametersHolder = new VBox();
        parametersHolder.setPrefHeight(200);
        parametersHolder.setPrefWidth(350);
        ScrollPane parametersScroll = new ScrollPane(parametersHolder);
        parametersScroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        grid.add(parametersScroll, 0, 4, GridPane.REMAINING, 1);

        Label parameterErrorMessageLabel = new Label("Method contains invalid parameter names!");
        parameterErrorMessageLabel.setTextFill(Color.RED);
        parameterErrorMessageLabel.setVisible(false);
        grid.add(parameterErrorMessageLabel, 0, 5);

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

        // Enable/Disable login button depending on whether a username was entered.
        Node confirmButton = dialog.getDialogPane().lookupButton(confirmButtonType);
        confirmButton.setDisable(true);

        Button addButton = new Button("Add");
        addButton.setOnAction(event -> {
            confirmButton.setDisable(true);
            parameterErrorMessageLabel.setVisible(true);
            ComboBox dataTypes = new ComboBox(dataTypeOptions);
            dataTypes.setOnAction(chooseEvent -> {
                updateSampleArea();
            });
            dataTypes.getSelectionModel().selectFirst();

            TextField parameterName = new TextField();
            parameterName.setPromptText("Parameter Name");
            parameterName.textProperty().addListener((observable, oldValue, newValue) -> {
                /*System.out.println("Parameter Name: " + newValue);
                if (hasInvalidParameters()) {
                    confirmButton.setDisable(true);
                    parameterErrorMessageLabel.setVisible(true);
                    System.out.println("Found duplicate parameter name");
                }
                else {
                    confirmButton.setDisable(false);
                    parameterErrorMessageLabel.setVisible(false);
                }*/
                boolean valid = inputIsValid();

                confirmButton.setDisable(!valid);
                parameterErrorMessageLabel.setVisible(hasInvalidParameters());
                updateSampleArea();
            });

            Button removeButton = new Button("X");

            HBox parameters = new HBox(dataTypes, parameterName, removeButton);

            removeButton.setOnAction(value -> {
                parametersHolder.getChildren().remove(parameters);
                confirmButton.setDisable(!inputIsValid());
                parameterErrorMessageLabel.setVisible(hasInvalidParameters());
                updateSampleArea();
            });

            parametersHolder.getChildren().add(parameters);
        });
        grid.add(addButton, 1, 3);

        sampleArea = new TextArea();
        sampleArea.setEditable(false);
        sampleArea.setPrefWidth(200);
        updateSampleArea();

        grid.add(sampleArea, 0, 6, GridPane.REMAINING, 1);


        // Do some validation (using the Java 8 lambda syntax).
        methodName.textProperty().addListener((observable, oldValue, newValue) -> {
            boolean methodNameExists = MethodList.getInstance().methodNameExists(newValue);
            boolean invalid = newValue.trim().isEmpty() || methodNameExists;
            confirmButton.setDisable(!inputIsValid());
            errorMessageLabel.setVisible(methodNameExists);
            updateSampleArea();
        });

        dialog.getDialogPane().setContent(grid);

        // Request focus on the username field by default.
        Platform.runLater(() -> methodName.requestFocus());

        // Convert the result to a string
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == confirmButtonType) {
                return generateSampleString();

            }
            return null;
        });
    }

    public boolean hasInvalidParameters() {
        BaracoMethodTemplate methodTemplate = new BaracoMethodTemplate();
        for (Node node : parametersHolder.getChildren()) {
            HBox child = (HBox) node;

            ObservableList<Node> parameterInfo = child.getChildren();

            String parameterName = ((TextField) parameterInfo.get(1)).getText().trim();

            if (parameterName.isEmpty()) {
                return true;
            }

            String dataType = ((ComboBox) parameterInfo.get(0)).getValue().toString();
            BaracoMethodTemplateParameter parameter = new BaracoMethodTemplateParameter(parameterName, dataType);

            if (methodTemplate.hasParameter(parameter)) {
                return true;
            }

            methodTemplate.addParameter(parameter);
        }
        return false;
    }

    public String showGenerateMethodDialog() {
        Optional<String> result = dialog.showAndWait();

        return result.get();
    }

    public boolean inputIsValid() {
        boolean methodNameExists = MethodList.getInstance().methodNameExists(methodName.getText());
        boolean invalidMethodName = methodName.getText().trim().isEmpty() || methodNameExists;

        hasInvalidParameters();

        return !methodNameExists && !invalidMethodName && !hasInvalidParameters();
    }

    private void updateSampleArea() {
        this.sampleArea.setText(generateSampleString());
    }

    private String generateSampleString() {
        BaracoMethodTemplate methodTemplate = new BaracoMethodTemplate();
        methodTemplate.setMethodName(methodName.getText().trim());
        methodTemplate.setReturnType(returnTypeComboBox.getValue().toString());
        methodTemplate.setIsPublic(publicRadio.isSelected());

        for (Node node : parametersHolder.getChildren()) {
            HBox child = (HBox) node;

            ObservableList<Node> parameterInfo = child.getChildren();

            String parameterName = ((TextField) parameterInfo.get(1)).getText().trim();

            if (parameterName.isEmpty()) {
                continue;
            }

            String dataType = ((ComboBox) parameterInfo.get(0)).getValue().toString();
            BaracoMethodTemplateParameter parameter = new BaracoMethodTemplateParameter(parameterName, dataType);

            /*if (methodTemplate.hasParameter(parameter)) {
                ErrorDialogHandler errorDialogHandler = new ErrorDialogHandler();
                errorDialogHandler.showErrorDialog("Duplicate parameter! Try again!");
                return null;
            }*/ 

            methodTemplate.addParameter(parameter);
        }

        return methodTemplate.toString();
    }
}
