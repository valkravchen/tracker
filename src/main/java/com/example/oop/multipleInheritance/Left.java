package com.example.oop.multipleInheritance;

public interface Left {
    default void speak() {
        System.out.println("Лево");
    }
}
