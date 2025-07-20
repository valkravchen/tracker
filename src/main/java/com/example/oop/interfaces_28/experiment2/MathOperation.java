package com.example.oop.interfaces_28.experiment2;

public interface MathOperation {
    double execute(double a, double b);

    static MathOperation add() {
        return (a, b) -> a + b;
    }

    static MathOperation multiply() {
        return (a, b) -> a * b;
    }

    static MathOperation power() {
        return Math::pow;
    }

    default String describe(double a, double b) {
        return "Результат: " + execute(a, b);
    }

    public static void main(String[] args) {
        MathOperation addition = MathOperation.add();
        MathOperation multiplication = MathOperation.multiply();
        MathOperation power = MathOperation.power();
        System.out.println("Сложение: " + addition.describe(5.0, 3.0));
        System.out.println("Умножение: " + multiplication.describe(5.0, 3.0));
        System.out.println("Возведение в степень: " + power.describe(5.0, 3.0));
    }
}
