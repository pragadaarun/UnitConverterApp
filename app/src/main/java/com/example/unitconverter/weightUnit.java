package com.example.unitconverter;

public enum weightUnit{
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
