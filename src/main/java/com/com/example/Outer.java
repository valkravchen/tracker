package com.com.example;

public class Outer {
    private String field = "Нестатическое поле";

    class Inner {
        void print() {
            System.out.println(field);
        }
    }
}
