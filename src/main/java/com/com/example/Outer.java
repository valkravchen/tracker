package com.com.example;

public class Outer {
    private String message = "Здравствуй, inner class!";

    class Inner {
        void print() {
            System.out.println(message);
        }
    }
}


