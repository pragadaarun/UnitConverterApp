package com.example.unitconverter;

public class LengthClass {
    public String result = "";

    public String calculate(int inputValue, String fromUnit, String toUnit) {
        lengthUnit fromType = lengthUnit.valueOf(fromUnit);
        lengthUnit toType = lengthUnit.valueOf(toUnit);

        switch(fromType) {
            case Centimeter:
                result = (fromType.centimeterConvert(toType, inputValue));
                break;
            case Meter:
                result = (fromType.meterConvert(toType, inputValue));
                break;
            case Feet:
                result = (fromType.FeetConvert(toType, inputValue));
                break;
            case Inch:
                result = (fromType.InchConvert(toType, inputValue));
                break;
            case Yard:
                result = (fromType.YardConvert(toType, inputValue));
                break;
            default:
                break;
        }
        return result;
    }

}

