package baraco.semantics.searching;

import baraco.antlr.parser.BaracoParser;
import baraco.builder.ParserHandler;
import baraco.execution.MethodTracker;
import baraco.representations.BaracoMethod;
import baraco.representations.BaracoValue;
import baraco.semantics.symboltable.SymbolTableManager;
import baraco.semantics.symboltable.scopes.ClassScope;
import baraco.semantics.symboltable.scopes.LocalScopeCreator;

public class VariableSearcher {
    private final static String TAG = "VariableSearcher";

    public static BaracoValue searchVariable(String identifierString) {
        BaracoValue mobiValue = null;

        if(MethodTracker.getInstance().isInsideFunction()) {
            mobiValue = searchVariableInFunction(MethodTracker.getInstance().getLatestFunction(), identifierString);
        }

        if(mobiValue == null) {
            ClassScope classScope = SymbolTableManager.getInstance().getClassScope(ParserHandler.getInstance().getCurrentClassName());
            mobiValue = searchVariableInClassIncludingLocal(classScope, identifierString);
        }

        return mobiValue;
    }

    public static BaracoValue searchVariableInFunction(BaracoMethod baracoMethod, String identifierString) {
        BaracoValue baracoValue = null;

        if(baracoMethod.hasParameter(identifierString)) {
            baracoValue = baracoMethod.getParameter(identifierString);
        }
        else {
            baracoValue = LocalScopeCreator.searchVariableInLocalIterative(identifierString, baracoMethod.getParentLocalScope());
        }

        return baracoValue;
    }

    public static BaracoValue searchVariableInClassIncludingLocal(ClassScope classScope, String identifierString) {
        return classScope.searchVariableIncludingLocal(identifierString);
    }

    public static BaracoValue searchVariableInClass(ClassScope classScope, String identifierString) {
        return classScope.searchVariable(identifierString);
    }

}
