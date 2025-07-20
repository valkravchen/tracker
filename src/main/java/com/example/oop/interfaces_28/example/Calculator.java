package com.example.oop.interfaces_28.example;

public interface Calculator {
    double calculate(double a, double b);

    default boolean isPositiveResult(double a, double b) {
        return calculate(a, b) > 0;
    }

    static void printVersion() {
        System.out.println("Calculator v1.0");
    }

    private void logOperation(String operation) {
        System.out.println("Выполнена операция: " + operation);
    }

    private static String formatResult(double result) {
        return String.format("%.2f", result);
    }

    default void calculateWithLogging(double a, double b) {
        logOperation("calculation");
        System.out.println("Результат: " + formatResult(calculate(a, b)));
    }
}
