package baraco.representation;

public class BaracoValue {

    //these are the accepted primitive types
    public enum PrimitiveType {
        NOT_YET_IDENTIFIED,
        BOOL,
        INT,
        DECIMAL,
        STRING,
        CHAR,
        ARRAY
    }

    private Object defaultValue; //this value will no longer change.
    private Object value;
    private PrimitiveType primitiveType = PrimitiveType.NOT_YET_IDENTIFIED;
    private boolean finalFlag = false;

    public BaracoValue(Object value, PrimitiveType primitiveType) {
        if(value == null || checkValueType(value, primitiveType)) {
            this.value = value;
            this.primitiveType = primitiveType;
        }
        else {
            System.out.println("Value is not appropriate for  " +primitiveType+ "!");
        }
    }

    public void setPrimitiveType(PrimitiveType primitiveType) {
        this.primitiveType = primitiveType;
    }

    public void reset() {
        this.value = this.defaultValue;
    }

    /*
     * Marks this value as final if there is a final keyword
     */
    public void markFinal() {
        this.finalFlag = true;
    }

    public boolean isFinal() {
        return this.finalFlag;
    }

    public void setValue(String value) {

        if(this.primitiveType == PrimitiveType.NOT_YET_IDENTIFIED) {
            System.out.println("Primitive type not yet identified!");
        }

        else if(this.primitiveType == PrimitiveType.STRING) {
            value.replace("\"", "");

            this.value = value.replace("\"", "");
        }
        else if(this.primitiveType == PrimitiveType.ARRAY) {
            System.out.println(this.primitiveType + " is an array. Cannot directly change value.");
        }
        else {
            //attempts to type cast the value
            this.value = this.attemptTypeCast(value);
        }
    }


    private Object attemptTypeCast(String value) {
        switch(this.primitiveType) {
            case CHAR: return Character.valueOf(value.charAt(0));
            case BOOL: return Boolean.valueOf(value);
            case INT: return Integer.valueOf(value);
            case DECIMAL: return Double.valueOf(value);
            case STRING: return value;
            default: return null;
        }
    }

    public Object getValue() {
        return this.value;
    }

    public PrimitiveType getPrimitiveType() {
        return this.primitiveType;
    }


    public static boolean checkValueType(Object value, PrimitiveType primitiveType) {
        switch(primitiveType) {
            case CHAR:
                return value instanceof Character;
            case BOOL:
                return value instanceof Boolean;
            case INT:
                return value instanceof Integer;
            case DECIMAL:
                return value instanceof Double;
            case STRING:
                return value instanceof String;
            case ARRAY:
                return value instanceof Object;
            default:
                return false;
        }
    }

    /*
     * Utility function.
     * Attempts to add an empty variable based from keywords
     */
    public static BaracoValue createEmptyVariableFromKeywords(String primitiveTypeString) {

        //identify primitive type
        PrimitiveType primitiveType = PrimitiveType.NOT_YET_IDENTIFIED;

        if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_BOOLEAN, primitiveTypeString)) {
            primitiveType = PrimitiveType.BOOL;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_CHAR, primitiveTypeString)) {
            primitiveType = PrimitiveType.CHAR;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_DECIMAL, primitiveTypeString)) {
            primitiveType = PrimitiveType.DECIMAL;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_INT, primitiveTypeString)) {
            primitiveType = PrimitiveType.INT;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_STRING, primitiveTypeString)) {
            primitiveType = PrimitiveType.STRING;
        }

        BaracoValue baracoValue = new BaracoValue(null, primitiveType);

        return baracoValue;
    }
}
