package com.example.unitconverter;

public class TemperatureClass {
    public double result;
    public double calculate(int inputValue, String fromUnit, String toUnit) {
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

