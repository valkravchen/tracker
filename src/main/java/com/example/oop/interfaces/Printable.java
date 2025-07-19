package com.example.oop.interfaces;

public interface Printable {
    String getContent();

    default void print() {
        System.out.println("Содержимое: " + getContent());
    }

    default void printWithBorder() {
        System.out.println("*** " + getContent() + " ***");
    }
}
