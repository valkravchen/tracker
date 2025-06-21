package com.com.example;

public class Outer {
    private static String message = "Здравствуйте!";

    static class Nested {
        void print() {
            System.out.println(message);
        }
    }
}


