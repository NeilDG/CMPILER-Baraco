package baraco.templates;

import baraco.representations.BaracoValue;

import java.util.ArrayList;

public class BaracoMethodTemplate {

    String methodName;
    String returnType;
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

    public BaracoMethodTemplate setReturnType(String returnType) {
        this.returnType = returnType;
        return this;
    }

    public BaracoMethodTemplate addParameter(BaracoMethodTemplateParameter parameter) {
        this.parameters.add(parameter);
        return this;
    }

    public boolean hasParameter(BaracoMethodTemplateParameter parameter) {
        for (BaracoMethodTemplateParameter param : parameters) {
            if (param.getParameterName().equals(parameter)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        String method = "\tprivate " + returnType + " " + methodName + "(";

        for (int i = 0; i < parameters.size() - 1; i++) {
            method += parameters.get(i).toString() + ", ";
        }

        if (parameters.size() > 0) {
            method += parameters.get(parameters.size() - 1).toString();
        }

        method += "):\n\t\t" +
                "// Code goes here" +
                "\n\tend";


        return method;
    }
}


