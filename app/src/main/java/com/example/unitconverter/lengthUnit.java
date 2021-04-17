package com.example.unitconverter;

public enum lengthUnit{
    Centimeter, Meter, Feet, Inch, Yard;

    public String centimeterConvert(lengthUnit toType, int value) {
        double calculated = 0.0;
        switch (toType) {
            case Centimeter:
                calculated = value;
                break;
            case Meter:
                calculated = value * 0.01;
                break;
            case Feet:
                calculated = value * 0.0328084;
                break;
            case Inch:
                calculated = value * 0.393701;
                break;
            case Yard:
                calculated = value * 0.0109361;
                break;
            default:
                break;
        }

        return String.valueOf(calculated);
    }

    public String meterConvert(lengthUnit toType, int value) {
        double calculated = 0.0;
        switch (toType) {
            case Centimeter:
                calculated = value * 100;
                break;
            case Meter:
                calculated = value;
                break;
            case Feet:
                calculated = value * 3.28084;
                break;
            case Inch:
                calculated = value * 39.3701;
                break;
            case Yard:
                calculated = value * 1.09361;
                break;
            default:
                break;
        }

        return String.valueOf(calculated);
    }



    public String FeetConvert(lengthUnit toType, int value) {
        double calculated = 0.0;
        switch (toType) {
            case Centimeter:
                calculated = value * 30.48;
                break;
            case Meter:
                calculated = value * 0.3048;
                break;
            case Feet:
                calculated = value;
                break;
            case Inch:
                calculated = value * 12;
                break;
            case Yard:
                calculated = value * 0.333333;
                break;
            default:
                break;
        }

        return String.valueOf(calculated);
    }

    public String InchConvert(lengthUnit toType, int value) {
        double calculated = 0.0;
        switch (toType) {
            case Centimeter:
                calculated = value * 2.54;
                break;
            case Meter:
                calculated = value * 0.0254;
                break;
            case Feet:
                calculated = value * 0.0833333;
                break;
            case Inch:
                calculated = value;
                break;
            case Yard:
                calculated = value * 0.0277778;
                break;
            default:
                break;
        }

        return String.valueOf(calculated);
    }

    public String YardConvert(lengthUnit toType, int value) {   double calculated = 0.0;
        switch (toType) {
            case Centimeter:
                calculated = value * 91.44;
                break;
            case Meter:
                calculated = value * 0.9144;
                break;
            case Feet:
                calculated = value * 3;
                break;
            case Inch:
                calculated = value * 36;
                break;
            case Yard:
                calculated = value;
                break;
            default:
                break;
        }

        return String.valueOf(calculated);
    }
}
