package com.example.unitconverter;

public enum volumeUnit{
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
