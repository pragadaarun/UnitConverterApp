package com.example.unitconverter;

public class Converter {
    public String result = "";

    public String calculateOutput(int inputValue, String selectedType, String fromUnit, String toUnit) {

        switch(selectedType) {

            case "Length":
                LengthClass length = new LengthClass();
                result = length.calculate(inputValue, fromUnit, toUnit);
                break;
            case "Weight":
                WeightClass weight = new WeightClass();
                result = weight.calculate(inputValue, fromUnit, toUnit);
                break;
            case "Volume":
                VolumeClass volume = new VolumeClass();
                result = volume.calculate(inputValue, fromUnit, toUnit);
                break;
            case "Temperature":
                TemperatureClass temperature = new TemperatureClass();
                result = temperature.calculate(inputValue, fromUnit, toUnit);
                break;
        }

        return result;
    }
}
