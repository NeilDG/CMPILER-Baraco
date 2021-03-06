package baraco.semantics.analyzers;

import baraco.antlr.lexer.BaracoLexer;
import baraco.antlr.parser.BaracoParser;
import baraco.builder.errorcheckers.ClassNameChecker;
import baraco.representations.RecognizedKeywords;
import baraco.semantics.symboltable.SymbolTableManager;
import baraco.semantics.symboltable.scopes.ClassScope;
import baraco.semantics.utils.IdentifiedTokens;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class ClassAnalyzer {

    private ClassScope declaredClassScope;
    private IdentifiedTokens identifiedTokens;


    public final static String ACCESS_CONTROL_KEY = "ACCESS_CONTROL_KEY";
    public final static String CONST_CONTROL_KEY = "CONST_CONSTROL_KEY";
    public final static String STATIC_CONTROL_KEY = "STATIC_CONTROL_KEY";
    public final static String PRIMITIVE_TYPE_KEY = "PRIMITIVE_TYPE_KEY";
    public final static String IDENTIFIER_KEY = "IDENTIFIER_KEY";
    public final static String IDENTIFIER_VALUE_KEY = "IDENTIFIER_VALUE_KEY";

    public ClassAnalyzer() {

    }

    public void analyze(BaracoParser.ClassDeclarationContext ctx) {
        String className = ctx.Identifier().getText();

        System.out.println("Class name is " +className);
        ClassNameChecker classNameChecker = new ClassNameChecker(className);
        classNameChecker.verify();

        this.declaredClassScope = new ClassScope(classNameChecker.correctClassName());
        this.identifiedTokens = new IdentifiedTokens();

        SymbolTableManager.getInstance().addClassScope(this.declaredClassScope.getClassName(), this.declaredClassScope);
        this.analyzeClassMembers(ctx);
    }
    
    //TODO: Discontinued OOP method
    private void analyzeClassMembers(ParserRuleContext ctx) {
        if(ctx instanceof BaracoParser.ClassOrInterfaceModifierContext) {
            BaracoParser.ClassOrInterfaceModifierContext classModifierCtx = (BaracoParser.ClassOrInterfaceModifierContext) ctx;

            this.analyzeModifier(classModifierCtx);
        }

        else if(ctx instanceof BaracoParser.FieldDeclarationContext) {
            BaracoParser.FieldDeclarationContext fieldCtx = (BaracoParser.FieldDeclarationContext) ctx;

            if(fieldCtx.typeType() != null) {
                BaracoParser.TypeTypeContext typeCtx = fieldCtx.typeType();

                //check if its a primitive type
                if(ClassAnalyzer.isPrimitiveDeclaration(typeCtx)) {
                    BaracoParser.PrimitiveTypeContext primitiveTypeCtx = typeCtx.primitiveType();
                    this.identifiedTokens.addToken(PRIMITIVE_TYPE_KEY, primitiveTypeCtx.getText());

                    //create a field analyzer to walk through declarations
                    FieldAnalyzer fieldAnalyzer = new FieldAnalyzer(this.identifiedTokens, this.declaredClassScope);
                    fieldAnalyzer.analyze(fieldCtx.variableDeclarators());

                    //clear tokens for reause
                    this.identifiedTokens.clearTokens();
                }

                //check if its array declaration
                else if(ClassAnalyzer.isPrimitiveArrayDeclaration(typeCtx)) {
                    //Console.log(LogType.DEBUG, "Primitive array declaration: " +fieldCtx.getText());
                    ArrayAnalyzer arrayAnalyzer = new ArrayAnalyzer(this.identifiedTokens, this.declaredClassScope);
                    arrayAnalyzer.analyze(fieldCtx);
                }

                //this is for class type ctx
                else {

                    //a string identified
                    if(typeCtx.classOrInterfaceType().getText().contains(RecognizedKeywords.PRIMITIVE_TYPE_STRING)) {
                        BaracoParser.ClassOrInterfaceTypeContext classInterfaceCtx = typeCtx.classOrInterfaceType();
                        this.identifiedTokens.addToken(PRIMITIVE_TYPE_KEY, classInterfaceCtx.getText());
                    }

                    //create a field analyzer to walk through declarations
                    FieldAnalyzer fieldAnalyzer = new FieldAnalyzer(this.identifiedTokens, this.declaredClassScope);
                    fieldAnalyzer.analyze(fieldCtx.variableDeclarators());

                    //clear tokens for reause
                    this.identifiedTokens.clearTokens();
                }
            }
        }

        else if(ctx instanceof BaracoParser.MethodDeclarationContext) {
            BaracoParser.MethodDeclarationContext methodDecCtx = (BaracoParser.MethodDeclarationContext) ctx;
            OOPMethodAnalyzer methodAnalyzer = new OOPMethodAnalyzer(this.identifiedTokens, this.declaredClassScope);
            methodAnalyzer.analyze(methodDecCtx);

            //reuse tokens
            this.identifiedTokens.clearTokens();
        }
    }

    public static boolean isPrimitiveDeclaration(BaracoParser.TypeTypeContext typeCtx) {
        if(typeCtx.primitiveType() != null) {
            List<TerminalNode> lBrackToken = typeCtx.getTokens(BaracoLexer.LBRACK);
            List<TerminalNode> rBrackToken = typeCtx.getTokens(BaracoLexer.RBRACK);

            return (lBrackToken.size() == 0 && rBrackToken.size() == 0);
        }

        return false;
    }

    public static boolean isPrimitiveArrayDeclaration(BaracoParser.TypeTypeContext typeCtx) {
        if(typeCtx.primitiveType() != null) {
            List<TerminalNode> lBrackToken = typeCtx.getTokens(BaracoLexer.LBRACK);
            List<TerminalNode> rBrackToken = typeCtx.getTokens(BaracoLexer.RBRACK);

            return (lBrackToken.size() > 0 && rBrackToken.size() > 0);
        }

        return false;
    }

    private void analyzeModifier(BaracoParser.ClassOrInterfaceModifierContext ctx) {
        if(ctx.getTokens(BaracoLexer.PUBLIC).size() > 0 || ctx.getTokens(BaracoLexer.PRIVATE).size() > 0
                || ctx.getTokens(BaracoLexer.PROTECTED).size() > 0) {
            //Console.log(LogType.DEBUG, "Detected accessor: " +ctx.getText());
            this.identifiedTokens.addToken(ACCESS_CONTROL_KEY, ctx.getText());
        }
        else if(ctx.getTokens(BaracoLexer.FINAL).size() > 0) {
            //Console.log(LogType.DEBUG, "Detected const: " +ctx.getText());
            this.identifiedTokens.addToken(CONST_CONTROL_KEY, ctx.getText());
        }
        else if(ctx.getTokens(BaracoLexer.STATIC).size() > 0) {
            //Console.log(LogType.DEBUG, "Detected static: " +ctx.getText());
            this.identifiedTokens.addToken(STATIC_CONTROL_KEY, ctx.getText());
        }
    }

}
