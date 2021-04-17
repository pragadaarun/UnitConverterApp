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

enum weightUnit{
    Ton, Kilogram, Gram;

    public String tonConvert(weightUnit toType, int value) {
        double calculated = 0.0;
        switch (toType) {
            case Ton:
                calculated = value;
                break;
            case Kilogram:
                calculated = value * 1000;
                break;
            case Gram:
                calculated = value * 1000000;
                break;
            default :
                break;
        }

        return String.valueOf(calculated);
    }

    public String kilogramConvert(weightUnit toType, int value) {
        double calculated = 0.0;
        switch (toType) {
            case Ton:
                calculated = value * 0.001;
                break;
            case Kilogram:
                calculated = value;
                break;
            case Gram:
                calculated = value * 1000;
                break;
            default:
                break;
        }

        return String.valueOf(calculated);

    }
    public String gramConvert(weightUnit toType, int value) {
        double calculated = 0.0;
        switch (toType){
            case Ton:
                calculated = value * 0.000001;
                break;
            case Kilogram:
                calculated = value * 0.001;
                break;
            case Gram:
                calculated = value;
                break;
            default:
                break;

        }

        return String.valueOf(calculated);
    }
}
