package com.com.example;

public class Outer {
    private  String message = "Здравствуйте!";

    class Inner{
        void print() {
            System.out.println(message);
        }
    }
}


