package com.example.oop.anonymous_42.experiment1;

public interface Calculator {
    int calculate(int a, int b);

    default void showResult(int result) {
        System.out.println("Результат вычисления: " + result);
    }
}
