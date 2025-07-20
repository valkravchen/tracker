package com.example.oop.interfaces.experiment1;

public class CircleArea implements MathConstants {
    private double radius;

    public CircleArea(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculate() {
        return PI * radius * radius;
    }

    @Override
    public String getFormula() {
        return "π * r²";
    }
}
