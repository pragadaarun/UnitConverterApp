package com.example.unitconverter;

public class TemperatureClass {
    public String result = "";
    public String calculate(int inputValue, String fromUnit, String toUnit) {
        temperatureUnit fromType = temperatureUnit.valueOf(fromUnit);
        temperatureUnit toType = temperatureUnit.valueOf(toUnit);

        switch(fromType) {
            case Celsius:
                result = (fromType.celsiusConvert(toType, inputValue));
                break;
            case Fahrenheit:
                result = (fromType.fahrenheitConvert(toType, inputValue));
                break;
        }
        return result;
    }

}

enum temperatureUnit {
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