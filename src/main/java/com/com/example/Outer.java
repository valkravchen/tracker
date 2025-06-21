package com.com.example;

public class Outer {
    private String message = "Приветствую!";

    class Inner {
        void print() {
            System.out.println(Outer.this.message);
        }
    }
}
