package com.example.unitconverter;

public enum Unit {
    Inch(1),
    Feet(12),
    Centimeter(2.0 / 5),
    Meter(200 / 5),
    Yard(3*12),
    Milliliter(1),
    Liter(1000),
    Gallon(3785.41),
    Gram(1),
    Kilogram(1000),
    Ton(100000);

    private double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertToBase(double value) {
        return value * conversionFactor;
    }
    public double convertToAnother(double value){
        return value / conversionFactor;
    }
}
