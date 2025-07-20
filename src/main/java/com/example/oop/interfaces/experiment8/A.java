package com.example.oop.interfaces.experiment8;

public interface A {
    default void greet() {
        System.out.println("Привет от A");
    }
}
