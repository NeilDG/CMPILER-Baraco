package baraco.builder;

import baraco.antlr.error.BaracoErrorListener;
import baraco.antlr.lexer.BaracoLexer;
import baraco.antlr.parser.BaracoBaseListener;
import baraco.antlr.parser.BaracoBaseVisitor;
import baraco.antlr.parser.BaracoParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ParserHandler {

    private final static String TAG = "ParserHandler";
    private static ParserHandler sharedInstance = null;

    public static ParserHandler getInstance() {
        if(sharedInstance == null) {
            sharedInstance = new ParserHandler();
        }

        return sharedInstance;
    }

    private BaracoLexer sharedLexer;
    private BaracoParser sharedParser;

    private String currentClassName; //the current class being parsed

    private ParserHandler() {

    }

    public void parseText(String className, String textToParse) {
        this.currentClassName = className.replace(".bara", "");
        this.sharedLexer = new BaracoLexer(new ANTLRInputStream(textToParse));
        CommonTokenStream tokens = new CommonTokenStream(this.sharedLexer);
        this.sharedParser = new BaracoParser(tokens);
        this.sharedParser.removeErrorListeners();
        this.sharedParser.addErrorListener(new BaracoErrorListener());

        ParserRuleContext parserRuleContext = this.sharedParser.compilationUnit();
        System.out.println("DEBUG: " + parserRuleContext.toStringTree(this.sharedParser));

        //ParseTreeWalker treeWalker = new ParseTreeWalker();
        //treeWalker.walk(new BaracoBaseListener(), parserRuleContext);
        
        BaracoBaseVisitor baseVisitor = new BaracoBaseVisitor<Void>();
        baseVisitor.visit(parserRuleContext);

        System.out.println("Finished parsing. Compiled executables. Click RUN to execute");
    }

    /*
     * Returns the class name being parsed
     */
    public String getCurrentClassName() {
        return this.currentClassName;
    }
}
