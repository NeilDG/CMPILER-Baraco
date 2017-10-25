package baraco.ide;

import baraco.controller.Controller;
import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
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

import moka.error.BaracoError;

public class View extends Application {

    Controller controller;

    private static final String[] KEYWORDS = new String[] {
            "bool", "break", "case", "const", "do", "else", "decimal", "for",
            "if", "int", "return", "switch", "void", "while", "scanInt", "scanDec",
            "scanStr", "print", "println", "end", "and", "or"
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

    private CodeArea editor;
    private GridPane gridPane;
    private ExecutorService executor;
    private TextFlow console;

    @Override
    public void start(Stage primaryStage) throws IOException {
        executor = Executors.newSingleThreadExecutor();
        controller = new Controller(this);
        primaryStage.setTitle("Baraco IDE");
        primaryStage.setScene(setupComponents());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private Scene setupComponents() {
        gridPane = new GridPane();
        Scene scene = new Scene(gridPane, 1024, 768);
        scene.getStylesheets().add(View.class.getResource("java-keywords.css").toExternalForm());


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

        gridPane.add(new VirtualizedScrollPane<>(editor), 0, 1);

        // Setup console
        resetConsole();

        return scene;
    }

    private ToolBar setupToolbar() {
        // Setup toolbar
        Button fileButton = new Button("File");
        fileButton.setBackground(null);

        Button editButton = new Button("Edit");
        editButton.setBackground(null);

        Button runButton = new Button("Run");
        runButton.setDefaultButton(true);
        runButton.setOnAction(event -> {
            controller.run(editor.getText());
        });


        ToolBar toolBar = new ToolBar(fileButton, editButton, runButton);

        return toolBar;
    }

    public void highlightLineInEditor(int startRow, int startCol, int endRow, int endCol) {
        int startPos = editor.position(startRow, startCol).toOffset();
        int endPos = editor.position(endRow, endCol).toOffset();

        editor.selectRange(startPos, endPos);
    }

    public void printInConsole(String text) {
        Text error = new Text(text);

        console.getChildren().add(error);
    }

    public void appendErrorInConsole(BaracoError e) {

        Text errorPrefix = new Text(e.getErrorPrefix());
        Hyperlink line = new Hyperlink(e.getLineLayout());
        Text errorSuffix = new Text(e.getErrorSuffix());
        errorPrefix.setFill(Color.RED);
        errorSuffix.setFill(Color.RED);

        line.setOnAction(event -> {
            highlightLineInEditor(e.getLineNumber() - 1, e.getCharNumber(), e.getLineNumber() - 1, e.getCharNumber() + 1);
        });

        console.getChildren().add(errorPrefix);
        console.getChildren().add(line);
        console.getChildren().add(errorSuffix);
        console.getChildren().add(new Text("\n"));

    }

    public void resetConsole() {
        console = new TextFlow(new Text("Console: \n"));
        ScrollPane consoleScroll = new ScrollPane(console);
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
}