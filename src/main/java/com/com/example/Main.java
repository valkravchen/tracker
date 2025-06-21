package com.com.example;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            Outer.Nested obj = new Outer.Nested();
            System.out.println(obj);
        }
    }
}
