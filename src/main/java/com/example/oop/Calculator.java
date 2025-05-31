package com.example.oop;

public class Calculator {
    private int value1;
    private int value2;

    public int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return  a * b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultMultiply = multiply(6, 9);
        int resultAdd = calculator.add(3, 9);
        System.out.println(resultMultiply);
        System.out.println(resultAdd);
    }
}
