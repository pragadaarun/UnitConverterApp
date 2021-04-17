package com.example.unitconverter;

public class VolumeClass {
    public String result = "";

    public String calculate(int inputValue, String fromUnit, String toUnit) {
        volumeUnit fromType = volumeUnit.valueOf(fromUnit);
        volumeUnit toType = volumeUnit.valueOf(toUnit);

        switch(fromType) {
            case Liter:
                result = (fromType.literConvert(toType, inputValue));
                break;
            case Gallon:
                result = (fromType.gallonConvert(toType, inputValue));
                break;
            case Milliliter:
                result = (fromType.milliliterConvert(toType, inputValue));
                break;
            default:
                break;
        }
        return result;
    }

}

