package com.com.example;

public class Outer {
    Runnable task1 = () -> System.out.println("Лямбда!");
    Runnable task2 = () -> System.out.println("Ещё одна лямбда!");

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.task1.run();
        outer.task2.run();
    }
}
