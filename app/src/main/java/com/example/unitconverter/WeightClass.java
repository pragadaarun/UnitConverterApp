package com.example.unitconverter;

public class WeightClass {
    public String result = "";

    public String calculate(double inputValue, String fromUnit, String toUnit) {
        double thousandInverse = 0.001;
        double thousand = 1000;
        double tenLakh = 100000;
        double tenLakhInverse = 0.000001;

        if(fromUnit.equals(toUnit)){
            result = String.format("%f",inputValue);
        }
        else if(fromUnit.equals("Ton") && toUnit.equals("Kilogram")){
            double calculation = inputValue * thousand;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Ton") && toUnit.equals("Gram")){
            double calculation = inputValue * tenLakh;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Kilogram") && toUnit.equals("Ton")){
            double calculation = inputValue * thousandInverse;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Kilogram") && toUnit.equals("Gram")){
            double calculation = inputValue * thousand;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Gram") && toUnit.equals("Ton")){
            double calculation = inputValue * tenLakhInverse;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Gram") && toUnit.equals("Kilogram")){
            double calculation = inputValue * thousandInverse;
            result = String.format("%f",calculation);
        }
        else{
            // do nothing
        }

        return result;
    }

}
