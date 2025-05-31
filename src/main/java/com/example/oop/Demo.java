package com.example.oop;

public class Demo {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello");
            }
        };
        greeting.greet();
    }
}
