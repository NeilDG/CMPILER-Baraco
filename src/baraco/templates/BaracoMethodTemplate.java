package baraco.templates;

import baraco.representations.BaracoValue;

import java.util.ArrayList;

public class BaracoMethodTemplate {

    String methodName;
    BaracoValue.PrimitiveType returnType;
    ArrayList<BaracoMethodTemplateParameter> parameters;

    public BaracoMethodTemplate() {
        this.parameters = new ArrayList<>();
    }

    private String getMethodName() {
        return this.methodName;
    }

    public BaracoMethodTemplate setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }

    public BaracoMethodTemplate setReturnType(BaracoValue.PrimitiveType returnType) {
        this.returnType = returnType;
        return this;
    }

    public BaracoMethodTemplate addParameter(String parameterName, BaracoValue.PrimitiveType dataType) {
        this.parameters.add(new BaracoMethodTemplateParameter(parameterName, dataType));
        return this;
    }

    public BaracoMethodTemplate addParameter(BaracoMethodTemplateParameter parameter) {
        this.parameters.add(parameter);
        return this;
    }
}

class BaracoMethodTemplateParameter {

    String parameterName;
    BaracoValue.PrimitiveType dataType;

    public BaracoMethodTemplateParameter(String parameterName, BaracoValue.PrimitiveType dataType) {
        this.parameterName = parameterName;
        this.dataType = dataType;
    }

    public String getParameterName() {
        return parameterName;
    }

    public BaracoMethodTemplateParameter setParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    public BaracoValue.PrimitiveType getDataType() {
        return dataType;
    }

    public BaracoMethodTemplateParameter setDataType(BaracoValue.PrimitiveType dataType) {
        this.dataType = dataType;
        return this;
    }
}
