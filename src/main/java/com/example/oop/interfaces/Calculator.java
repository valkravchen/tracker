package com.example.oop.interfaces;

public class Calculator implements MathConstants {
    @Override
    public double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    public void printConstants() {
        System.out.println("Константы: PI = " + MathConstants.PI +
                ", дней в неделе = " + MathConstants.DAYS_IN_WEEK);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Площадь круга с радиусом 5.0: " + calculator.calculateCircleArea(5));
        calculator.printConstants();
    }
}
