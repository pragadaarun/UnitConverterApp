package com.example.unitconverter;

public class TemperatureClass {
    public String result = "";

    enum Operands{
        //toUnit(Celsius Constant, Fahrenheit Constant)
        Celsius(1,5.556),
        Fahrenheit(1.8,1);

        public double celsiusConstant;
        public double fahrenheitConstant;

        Operands(final double celsiusConstant, final double fahrenheitConstant){
            this.celsiusConstant = celsiusConstant;
            this.fahrenheitConstant = fahrenheitConstant;
        }

    }

    public String calculate(int inputValue, String fromUnit, String toUnit) {
        double fahrenheitConstant = 5.556;
        double celsiusConstant = 1.8;


        if(fromUnit.equals(toUnit)){
            result = String.format("%f",inputValue);
        }
        else if(fromUnit.equals("Celsius") && toUnit.equals("Fahrenheit")){
            double calculation = (inputValue-32)*fahrenheitConstant;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Fahrenheit") && toUnit.equals("Celsius")){
            double calculation = (inputValue*celsiusConstant) + 32;
            result = String.format("%f",calculation);
        }
        else{
            // do nothing
        }

        return result;
    }
}
