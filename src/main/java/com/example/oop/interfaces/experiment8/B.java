package com.example.oop.interfaces.experiment8;

public interface B {
    default void greet() {
        System.out.println("Привет от B");
    }
}
