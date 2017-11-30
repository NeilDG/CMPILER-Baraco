package baraco.templates;

import baraco.representations.BaracoValue;

public class BaracoMethodTemplateParameter {

    String parameterName;
    String dataType;

    public BaracoMethodTemplateParameter() {

    }

    public BaracoMethodTemplateParameter(String parameterName, String dataType) {
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

    public String getDataType() {
        return dataType;
    }

    public BaracoMethodTemplateParameter setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }


    @Override
    public String toString() {
        return dataType + " " + parameterName;
    }
}