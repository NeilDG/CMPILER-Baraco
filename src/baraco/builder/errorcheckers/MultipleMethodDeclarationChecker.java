package baraco.builder.errorcheckers;

import baraco.antlr.parser.BaracoParser;
import baraco.builder.BuildChecker;
import baraco.builder.ErrorRepository;
import baraco.builder.ParserHandler;
import baraco.representations.BaracoMethod;
import baraco.semantics.symboltable.SymbolTableManager;
import baraco.semantics.symboltable.scopes.ClassScope;
import org.antlr.v4.runtime.Token;

public class MultipleMethodDeclarationChecker implements IErrorChecker {


    private BaracoParser.MethodDeclarationContext methodDecCtx;
    private int lineNumber;

    public MultipleMethodDeclarationChecker(BaracoParser.MethodDeclarationContext methodDecCtx) {
        this.methodDecCtx = methodDecCtx;

        Token firstToken = methodDecCtx.getStart();
        this.lineNumber = firstToken.getLine();
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.builder.errorcheckers.IErrorChecker#verify()
     */
    @Override
    public void verify() {
        this.verifyFunctionCall(this.methodDecCtx.Identifier().getText());
    }

    private void verifyFunctionCall(String identifierString) {

        ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
                ParserHandler.getInstance().getCurrentClassName());
        BaracoMethod baracoMethod = classScope.searchMethod(identifierString);

        if(baracoMethod != null) {
            BuildChecker.reportCustomError(ErrorRepository.MULTIPLE_FUNCTION, "", identifierString, this.lineNumber);
        }
    }
}
