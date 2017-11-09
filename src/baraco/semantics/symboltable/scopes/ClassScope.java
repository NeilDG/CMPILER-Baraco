package baraco.semantics.symboltable.scopes;

import baraco.representation.BaracoMethod;
import baraco.representation.BaracoValue;

import java.util.HashMap;

public class ClassScope {

    private String className;

    private HashMap<String, BaracoValue> publicVariables;
    private HashMap<String, BaracoValue> privateVariables;

    private HashMap<String, BaracoMethod> publicFunctions;
    private HashMap<String, BaracoMethod> privateFunctions;

}
