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

enum volumeUnit{
    Liter, Gallon, Milliliter;
    public String literConvert(volumeUnit toType, int value) {
        double calculated = 0.0;
        switch (toType) {
            case Liter:
                calculated = value;
                break;
            case Gallon:
                calculated = value * 0.264172;
                break;
            case Milliliter:
                calculated = value * 1000;
                break;
            default :
                break;
        }

        return String.valueOf(calculated);
    }

    public String gallonConvert(volumeUnit toType, int value) {
        double calculated = 0.0;
        switch (toType) {
            case Liter:
                calculated = value * 0.001;
                break;
            case Gallon:
                calculated = value;
                break;
            case Milliliter:
                calculated = value * 3785.41;
                break;
            default :
                break;
        }

        return String.valueOf(calculated);
    }

    public String milliliterConvert(volumeUnit toType, int value) {
        double calculated = 0.0;
        switch (toType) {
            case Liter:
                calculated = value * 0.001;
                break;
            case Gallon:
                calculated = value * 0.000264172;
            case Milliliter:
                calculated = value;
                break;
            default :
                break;
        }

        return String.valueOf(calculated);
    }


}
