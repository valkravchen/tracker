package com.example.oop.multipleInheritance;

public interface Right {
    default void speak() {
        System.out.println("Право");
    }
}
