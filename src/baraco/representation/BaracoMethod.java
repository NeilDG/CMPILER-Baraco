package baraco.representation;
import baraco.execution.commands.ICommand;
import baraco.representation.BaracoValue.PrimitiveType;
import baraco.semantics.symboltable.scopes.ClassScope;
import baraco.semantics.symboltable.scopes.LocalScope;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class BaracoMethod {

    public enum MethodType {
        BOOL_TYPE,
        INT_TYPE,
        DECIMAL_TYPE,
        STRING_TYPE,
        CHAR_TYPE,
        ARRAY_TYPE,
        VOID_TYPE
    }

    private Object defaultValue; //this value will no longer change.
    private Object value;
    private PrimitiveType primitiveType = PrimitiveType.NOT_YET_IDENTIFIED;
    private boolean finalFlag = false;

    private String methodName;
    private List<ICommand> commandSequences; //the list of commands execution by the function

    private LocalScope parentLocalScope; //refers to the parent local scope of this function.

    private LinkedHashMap<String, ClassScope> parameterReferences; //the list of parameters accepted that follows the 'call-by-reference' standard.
    private LinkedHashMap<String, BaracoValue> parameterValues;	//the list of parameters accepted that follows the 'call-by-value' standard.
    private BaracoValue returnValue; //the return value of the function. null if it's a void type
    private MethodType returnType = MethodType.VOID_TYPE; //the return type of the function

    public BaracoMethod() {
        this.commandSequences = new ArrayList<ICommand>();
        this.parameterValues = new LinkedHashMap<String, BaracoValue>();
        this.parameterReferences = new LinkedHashMap<String, ClassScope>();
    }

    public void setParentLocalScope(LocalScope localScope) {
        this.parentLocalScope = localScope;
    }

    public LocalScope getParentLocalScope() {
        return this.parentLocalScope;
    }

    public void setReturnType(MethodType methodType) {
        this.returnType = methodType;

        //create an empty mobi value as a return value
        switch(this.returnType) {
            case BOOL_TYPE: this.returnValue = new BaracoValue(true, PrimitiveType.BOOL); break;
            case INT_TYPE: this.returnValue = new BaracoValue(0, PrimitiveType.INT); break;
            case DECIMAL_TYPE: this.returnValue = new BaracoValue(' ', PrimitiveType.DECIMAL); break;
            case STRING_TYPE: this.returnValue = new BaracoValue(0, PrimitiveType.STRING); break;
            case CHAR_TYPE: this.returnValue = new BaracoValue(0, PrimitiveType.CHAR); break;
            case ARRAY_TYPE: this.returnValue = new BaracoValue(0, PrimitiveType.ARRAY); break;
            default:break;
        }
    }

    public MethodType getReturnType() {
        return this.returnType;
    }

    public void setFunctionName(String functionName) {
        this.methodName = functionName;
    }

    public String getFunctionName() {
        return this.methodName;
    }
}
