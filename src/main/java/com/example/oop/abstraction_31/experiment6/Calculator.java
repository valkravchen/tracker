package com.example.oop.abstraction_31.experiment6;

public abstract class Calculator {
    public abstract double calculate(double a, double b);

    public abstract double calculate(double a, double b, double c);

    public abstract String calculate(String operation, double a, double b);

    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }
}
