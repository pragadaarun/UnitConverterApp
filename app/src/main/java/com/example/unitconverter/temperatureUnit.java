package com.example.unitconverter;

public enum temperatureUnit {
    Celsius, Fahrenheit;
    public String celsiusConvert(temperatureUnit toType, int value) {
        double calculated = 0.0;
        switch (toType) {
            case Celsius:
                calculated = value;
                break;
            case Fahrenheit:
                calculated = (value * 1.8) + 32;
                break;
            default :
                break;
        }

        return String.valueOf(calculated);
    }

    public String fahrenheitConvert(temperatureUnit toType, int value) {
        double calculated = 0.0;
        switch (toType) {
            case Celsius:
                calculated = (value - 32) * 5.556;
                break;
            case Fahrenheit:
                calculated = value;
                break;
            default :
                break;
        }

        return String.valueOf(calculated);
    }
}
