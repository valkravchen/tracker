package com.example.oop.abstraction_31.experiment6;

public class BasicCalculator extends Calculator {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }

    @Override
    public double calculate(double a, double b, double c) {
        return a + b + c;
    }

    @Override
    public String calculate(String operation, double a, double b) {
        if ("multiply".equals(operation)) {
            return "Произведение: " + (a * b);
        } else {
           return  "Неизвестная операция";
        }
    }

    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculator();
        double result1 = basicCalculator.calculate(5.0, 3.0);
        double result2 = basicCalculator.calculate(2.0, 4.0, 6.0);
        String result3 = basicCalculator.calculate("multiply", 7.0, 8.0);
        System.out.println("Результат: " + result1);
        System.out.println("Результат: " + result2);
        System.out.println(result3);
    }
 }
