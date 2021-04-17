package com.example.unitconverter;

public class WeightClass {
    public String result = "";

    public String calculate(int inputValue, String fromUnit, String toUnit) {
        weightUnit fromType = weightUnit.valueOf(fromUnit);
        weightUnit toType = weightUnit.valueOf(toUnit);

        switch(fromType) {
            case Ton:
                result = (fromType.tonConvert(toType, inputValue));
                break;
            case Kilogram:
                result = (fromType.kilogramConvert(toType, inputValue));
                break;
            case Gram:
                result = (fromType.gramConvert(toType, inputValue));
                break;
            default:
                break;
        }
        return result;
    }

}

