package com.example.oop.interfaces_27.experiment2;

public interface Calculator {
    double calculate(double a, double b);

    String getOperation();

    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public double calculate(double a, double b) {
                return a + b;
            }

            @Override
            public String getOperation() {
                return "Сложение";
            }
        };
        double a = 15.5;
        double b = 24.3;
        System.out.println("Операция: " + calculator.getOperation());
        System.out.println("Результат: " + a + " + " + b + " = " + calculator.calculate(a, b));
    }
}
