package ru.oop;

public class Calculator {


    private static int x = 5;

    public static int sum(int number) {
        return x + number;
    }

    public static int minus(int number) {
        return number - x;
    }

    public int multiply(int number) {
        return x * number;
    }

    public int divide(int number) {
        return number / x;
    }

    public int sumAllOperation(int number) {
        return sum(number) + minus(number) + multiply(number) + divide(number);
    }

    public static void main(String[] args) {
        int number = 55;
        Calculator calculator = new Calculator();
        int resultSum = sum(number);
        int resultMinus = minus(number);
        int resultMultiply = calculator.multiply(number);
        int resultDivide = calculator.divide(number);
        int resultSumAllOperation = calculator.sumAllOperation(number);
        System.out.println(resultSum);
        System.out.println(resultMinus);
        System.out.println(resultMultiply);
        System.out.println(resultDivide);
        System.out.println(resultSumAllOperation);
    }
}