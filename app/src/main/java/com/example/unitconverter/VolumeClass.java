package com.example.unitconverter;

public class VolumeClass {
    public String result = "";

    public String calculate(int inputValue, String fromUnit, String toUnit) {
        double literConstant = 0.001;
        double milliLiterConstant = 1000;


        if(fromUnit.equals(toUnit)){
            result = String.format("%f",inputValue);
        }
        else if(fromUnit.equals("Milliliter") && toUnit.equals("Liter")){
            double calculation = inputValue * literConstant;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Liter") && toUnit.equals("Milliliter")){
            double calculation = inputValue * milliLiterConstant;
            result = String.format("%f",calculation);
        }
        else{
            // do nothing
        }

        return result;
    }
}
