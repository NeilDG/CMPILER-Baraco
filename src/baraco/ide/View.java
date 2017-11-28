package baraco.ide;

import baraco.builder.BuildChecker;
import baraco.controller.Controller;
import baraco.execution.ExecutionManager;
import baraco.execution.MethodTracker;
import baraco.file.FileHandler;
import baraco.semantics.statements.StatementControlOverseer;
import baraco.semantics.symboltable.SymbolTableManager;
import baraco.semantics.symboltable.scopes.LocalScopeCreator;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToolBar;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;

import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import baraco.antlr.error.BaracoError;

public class View extends Application {

    private static final String[] KEYWORDS = new String[] {
            "bool", "break", "case", "final", "do", "else", "decimal", "for",
            "if", "int", "return", "switch", "void", "while", "print", "println",
            "end", "and", "or", "class", "public", "private", "true", "false", "string",
            "char", "final", "scan"
    };

    private static final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
    private static final String PAREN_PATTERN = "\\(|\\)";
    private static final String BRACE_PATTERN = "\\{|\\}";
    private static final String BRACKET_PATTERN = "\\[|\\]";
    private static final String SEMICOLON_PATTERN = "\\;";
    private static final String STRING_PATTERN = "\"([^\"\\\\]|\\\\.)*\"";
    private static final String COMMENT_PATTERN = "//[^\n]*" + "|" + "/\\*(.|\\R)*?\\*/";

    private static final Pattern PATTERN = Pattern.compile(
            "(?<KEYWORD>" + KEYWORD_PATTERN + ")"
                    + "|(?<PAREN>" + PAREN_PATTERN + ")"
                    + "|(?<BRACE>" + BRACE_PATTERN + ")"
                    + "|(?<BRACKET>" + BRACKET_PATTERN + ")"
                    + "|(?<SEMICOLON>" + SEMICOLON_PATTERN + ")"
                    + "|(?<STRING>" + STRING_PATTERN + ")"
                    + "|(?<COMMENT>" + COMMENT_PATTERN + ")"
    );

    private Controller controller;
    public static CodeArea editor;
    private GridPane gridPane;
    private ExecutorService executor;
    public static TextFlow console;
    private FileHandler fileHandler;
    private Stage stage;
    private String currentFileName;

    private ScanDialogHandler scanDialogHandler;

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.stage = primaryStage;
        executor = Executors.newSingleThreadExecutor();
        controller = new Controller(this);

        this.currentFileName = "";
        this.fileHandler = new FileHandler(primaryStage);
        primaryStage.setTitle("Baraco IDE");
        primaryStage.setScene(setupComponents());
        primaryStage.show();

        this.scanDialogHandler = new ScanDialogHandler();

        SymbolTableManager.initialize();
        BuildChecker.initialize();
        ExecutionManager.initialize();
        LocalScopeCreator.initialize();
        StatementControlOverseer.initialize();
        MethodTracker.initialize();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private Scene setupComponents() {
        gridPane = new GridPane();
        Scene scene = new Scene(gridPane, 1024, 768);
        scene.getStylesheets().add(View.class.getResource("java-keywords.css").toExternalForm());

        scene.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.S && e.isMetaDown() && e.isShiftDown()) {
                System.out.println("Save As shortcut");
                saveAsFile();
            }
            else if(e.getCode() == KeyCode.S && e.isMetaDown()) {
                System.out.println("Save shortcut");
                saveFile();
            }
            else if(e.getCode() == KeyCode.O && e.isMetaDown()) {
                System.out.println("Open shortcut");
                openFile();
            }
            else if(e.getCode() == KeyCode.N && e.isMetaDown()) {
                System.out.println("New shortcut");
                newFile();
            }
        });


        // Set column constraints
        /*ColumnConstraints col1 = new ColumnConstraints();
        col1.setPrefWidth(20);
        col1.setMaxWidth(col1.getPrefWidth());
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(100);
        gridPane.getColumnConstraints().addAll(col1, col2);*/
        ColumnConstraints col0 = new ColumnConstraints();
        col0.setPercentWidth(100);
        gridPane.getColumnConstraints().add(col0);

        // Set row constraints
        RowConstraints row1 = new RowConstraints();
        row1.setPrefHeight(20);
        row1.setMaxHeight(row1.getPrefHeight());
        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(70);
        RowConstraints row3 = new RowConstraints();
        row3.setPercentHeight(30);
        gridPane.getRowConstraints().addAll(row1, row2, row3);


        gridPane.add(setupToolbar(), 0, 0, GridPane.REMAINING, 1);

        // Credits to RichTextFX for the API
        editor = new CodeArea();
        editor.setParagraphGraphicFactory(LineNumberFactory.get(editor));

        editor.richChanges()
                .filter(ch -> !ch.getInserted().equals(ch.getRemoved())) // XXX
                .successionEnds(Duration.ofMillis(500))
                .supplyTask(this::computeHighlightingAsync)
                .awaitLatest(editor.richChanges())
                .filterMap(t -> {
                    if(t.isSuccess()) {
                        return Optional.of(t.get());
                    } else {
                        t.getFailure().printStackTrace();
                        return Optional.empty();
                    }
                })
                .subscribe(this::applyHighlighting);

        editor.textProperty().addListener((observable, oldValue, newValue) -> {
            if (fileHandler.save(editor.getText())) {
                updateCurrentFileName();
            }
        });

        gridPane.add(new VirtualizedScrollPane<>(editor), 0, 1);

        // Setup console
        resetConsole();

        return scene;
    }

    private ToolBar setupToolbar() {
        // Setup toolbar
        Button openButton = new Button("Open");
        openButton.setOnAction(event -> {
            openFile();
        });

        Button newButton = new Button("New");
        newButton.setOnAction(event -> {
            newFile();
        });

        Button saveButton = new Button("Save");
        saveButton.setOnAction(event -> {
            saveFile();
        });

        Button saveAsButton = new Button("Save As");
        saveAsButton.setOnAction(event -> {
            saveAsFile();
        });

        Button runButton = new Button("Run");
        runButton.setDefaultButton(true);
        runButton.setOnAction(event -> {
            controller.run(editor.getText(), this.currentFileName);
        });


        ToolBar toolBar = new ToolBar(openButton, newButton, saveButton, saveAsButton, runButton);

        return toolBar;
    }

    public static void highlightLineInEditor(int startRow, int startCol, int endRow, int endCol) {
        int startPos = editor.position(startRow, startCol).toOffset();
        int endPos = editor.position(endRow, endCol).toOffset();

        editor.selectRange(startPos, endPos);
    }

    public static void printInConsole(String text) {
        Text error = new Text(text);
        error.setFont(Font.font("Courier", 14));


        Platform.runLater(() -> {
            console.getChildren().add(error);
        });
    }

    public static void appendErrorInConsole(BaracoError e) {

        Text errorPrefix = new Text(e.getErrorPrefix());
        errorPrefix.setFont(Font.font("Courier", 14));

        Hyperlink line = new Hyperlink(e.getLineLayout());
        line.setFont(Font.font("Courier", 14));
        Text errorSuffix = new Text(e.getErrorSuffix());
        errorSuffix.setFont(Font.font("Courier", 14));
        errorPrefix.setFill(Color.RED);
        errorSuffix.setFill(Color.RED);

        line.setOnAction(event -> {
            if (e.getCharNumber() != -1)
                highlightLineInEditor(e.getLineNumber() - 1, e.getCharNumber(), e.getLineNumber() - 1, e.getCharNumber() + 1);
            else
                highlightLineInEditor(e.getLineNumber() - 1, 1, e.getLineNumber() - 1, 1);

        });

        console.getChildren().add(errorPrefix);
        console.getChildren().add(line);
        console.getChildren().add(errorSuffix);
        console.getChildren().add(new Text("\n"));

    }

    public void resetConsole() {
        Text consoleText = new Text("Console: \n");
        consoleText.setFont(Font.font("Courier", 12));
        console = new TextFlow(consoleText);
        ScrollPane consoleScroll = new ScrollPane(console);
        consoleScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        gridPane.add(consoleScroll, 0, 2, GridPane.REMAINING, 1);
    }

    // Start of code for editor keyword highlighting
    @Override
    public void stop() {
        executor.shutdown();
    }

    private Task<StyleSpans<Collection<String>>> computeHighlightingAsync() {
        String text = editor.getText();
        Task<StyleSpans<Collection<String>>> task = new Task<StyleSpans<Collection<String>>>() {
            @Override
            protected StyleSpans<Collection<String>> call() throws Exception {
                return computeHighlighting(text);
            }
        };
        executor.execute(task);
        return task;
    }

    private void applyHighlighting(StyleSpans<Collection<String>> highlighting) {
        editor.setStyleSpans(0, highlighting);
    }

    private static StyleSpans<Collection<String>> computeHighlighting(String text) {
        Matcher matcher = PATTERN.matcher(text);
        int lastKwEnd = 0;
        StyleSpansBuilder<Collection<String>> spansBuilder
                = new StyleSpansBuilder<>();
        while(matcher.find()) {
            String styleClass =
                    matcher.group("KEYWORD") != null ? "keyword" :
                            matcher.group("PAREN") != null ? "paren" :
                                    matcher.group("BRACE") != null ? "brace" :
                                            matcher.group("BRACKET") != null ? "bracket" :
                                                    matcher.group("SEMICOLON") != null ? "semicolon" :
                                                            matcher.group("STRING") != null ? "string" :
                                                                    matcher.group("COMMENT") != null ? "comment" :
                                                                            null; /* never happens */ assert styleClass != null;
            spansBuilder.add(Collections.emptyList(), matcher.start() - lastKwEnd);
            spansBuilder.add(Collections.singleton(styleClass), matcher.end() - matcher.start());
            lastKwEnd = matcher.end();
        }
        spansBuilder.add(Collections.emptyList(), text.length() - lastKwEnd);
        return spansBuilder.create();
    }

    public Controller getController() {
        return this.controller;
    }

    private void updateCurrentFileName() {
        this.currentFileName = this.fileHandler.getCurrentFileName();
        this.stage.setTitle("Baraco IDE - " + this.currentFileName);
    }

    private void setCodeTemplate() {
        String className = this.currentFileName.replace(".bara", "");
        String content = "class " + className +
                ": \n" +
                "\tvoid main(): \n\n" +
                "\tend\n" +
                "end";
        this.editor.replaceText(content);
    }

    private void saveFile() {
        if (this.fileHandler.save(editor.getText())) {
            this.updateCurrentFileName();
        }
    }

    private void saveAsFile() {
        if (this.fileHandler.saveAs(editor.getText())) {
            this.updateCurrentFileName();
        }
    }

    private void openFile() {
        String content = this.fileHandler.open();
        if (content != null) {
            this.editor.replaceText(content);
            this.updateCurrentFileName();
        }
    }

    private void newFile() {
        if (this.fileHandler.newFile()) {
            this.updateCurrentFileName();
            this.setCodeTemplate();
            this.saveFile();
        }
    }
}
