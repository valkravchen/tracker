package com.example.oop.interfaces_28.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Adder();
        double result = calculator.calculate(5, 3);
        System.out.println(result);
        boolean positive = calculator.isPositiveResult(5, 3);
        System.out.println(positive);
        Calculator.printVersion();
        calculator.calculateWithLogging(5, 3);
    }
}
