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

    public static void main(String[] args) {
        CircleArea circleArea = new CircleArea(5);
        System.out.println("Формула: " + circleArea.getFormula());
        System.out.println("Площадь: " + circleArea.calculate());
        System.out.println("Константы: π = " + PI + ", e = " + E +
                ", макс. итераций = " + MAX_ITERATIONS);
    }
}
