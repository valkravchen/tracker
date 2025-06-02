package com.example.oop;

public class OuterClass {
    private static String staticField = "Статическое поле";
    private String instanceField = "поле экземпляра";

    public static class Nested {
        public void print() {
            System.out.println(staticField);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
    }
}
