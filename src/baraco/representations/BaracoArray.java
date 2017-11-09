package baraco.representations;

import baraco.builder.ErrorRepository;
import baraco.representations.BaracoValue.PrimitiveType;

public class BaracoArray {
    private final static String TAG = "BaracoArray";

    private BaracoValue[] baracoValueArray;
    private PrimitiveType arrayPrimitiveType;
    private String arrayIdentifier;
    private boolean finalFlag = false;

    public BaracoArray(PrimitiveType primitiveType, String identifier) {
        this.arrayPrimitiveType = primitiveType;
        this.arrayIdentifier = identifier;
    }

    public void setPrimitiveType(PrimitiveType primitiveType) {
        this.arrayPrimitiveType = primitiveType;
    }

    public PrimitiveType getPrimitiveType() {
        return this.arrayPrimitiveType;
    }

    public void markFinal() {
        this.finalFlag = true;
    }

    public boolean isFinal() {
        return this.finalFlag;
    }

    public void initializeSize(int size) {
        this.baracoValueArray = new BaracoValue[size];
        System.out.println(TAG + ": Mobi array initialized to size " +this.baracoValueArray.length);
    }

    public int getSize() {
        return this.baracoValueArray.length;
    }

    public void updateValueAt(BaracoValue mobiValue, int index) {
        if(index >= this.baracoValueArray.length) {
            System.out.println("ERROR: " + String.format(ErrorRepository.getErrorMessage(ErrorRepository.RUNTIME_ARRAY_OUT_OF_BOUNDS), this.arrayIdentifier));
            return;
        }
        this.baracoValueArray[index] = mobiValue;
    }

    public BaracoValue getValueAt(int index) {
        if(index >= this.baracoValueArray.length) {
            System.out.println("ERROR: " + String.format(ErrorRepository.getErrorMessage(ErrorRepository.RUNTIME_ARRAY_OUT_OF_BOUNDS), this.arrayIdentifier));
            return this.baracoValueArray[this.baracoValueArray.length - 1];
        }
        else {
            return this.baracoValueArray[index];
        }
    }

    /*
     * Utility function that returns an arary of specified primitive type.
     */
    public static BaracoArray createArray(String primitiveTypeString, String arrayIdentifier) {
        //identify primitive type
        PrimitiveType primitiveType = PrimitiveType.NOT_YET_IDENTIFIED;

        if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_BOOLEAN, primitiveTypeString))
            primitiveType = PrimitiveType.BOOL;
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

        BaracoArray mobiArray = new BaracoArray(primitiveType, arrayIdentifier);

        return mobiArray;
    }
}
