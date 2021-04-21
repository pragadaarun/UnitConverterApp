package com.example.unitconverter;

public class Converter {
    public double result;
    Unit unit;

    public String calculateOutput(int inputValue, String selectedType, String fromUnit, String toUnit) {

        switch(selectedType) {

            case "Temperature":
                TemperatureClass temperature = new TemperatureClass();
                result = temperature.calculate(inputValue, fromUnit, toUnit);
                break;
            default:
                Unit fromType = Unit.valueOf(fromUnit);
                Unit toType = Unit.valueOf(toUnit);
                result = (fromType.convertToBase(inputValue));
                result = (toType.convertToAnother(result));
        }

        return String.valueOf(result);
    }
}
