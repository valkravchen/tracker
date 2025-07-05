package com.example.oop.methodOverloading;

import java.util.Objects;

public class Calculator {
    private String name;

    public Calculator(String name) {
        this.name = validateName(name);
    }

    public String calculate(int value) {
        validateValue(value);
        return "Квадрат числа " + value + " = " + (value * value);
    }

    public String calculate(double value) {
        validateValue(value);
        return "Куб числа " + value + " = " + (value * value * value);
    }

    public String calculate(String operation, int a, int b) {
        validateOperation(operation);
        validateValues(a, b);
        if (operation.equals("sum")) {
            return "Сумма " + a + " и " + b + " = " + (a + b);
        } else {
            return "Произведение " + a + " и " + b + " = " + (a * b);
        }
    }

    public String calculate(int a, int b, int c) {
        validateValues(a, b, c);
        return "Сумма чисел " + a + ", " + b + ", " + c + " = " + (a + b + c);
    }

    private String validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть null или пустой строкой");
        }
        return name;
    }

    private void validateValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Значение не может быть отрицательным");
        }
    }

    private void validateValue(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Значение не может быть отрицательным");
        }
    }

    private void validateOperation(String operation) {
        if (!operation.equals("sum") && !operation.equals("multiply")) {
            throw new IllegalArgumentException("Операция должна быть 'sum' или 'multiply'");
        }
    }

    private void validateValues(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Значения не могут быть отрицательными");
        }
    }

    private void validateValues(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Значения не могут быть отрицательными");
        }
    }

    public String getName() {
        return name;
    }
}
