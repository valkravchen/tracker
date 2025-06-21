package com.com.example;

public class Outer {
    private static String staticField = "Статическое поле";

    static class Nested {
        void print() {
            System.out.println(staticField);
        }
    }
}
