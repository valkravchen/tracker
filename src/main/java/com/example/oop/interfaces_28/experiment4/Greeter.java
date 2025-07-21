package com.example.oop.interfaces_28.experiment4;

public interface Greeter {
    default String greet(String name) {
        return "Привет, " + name + "!";
    }

    default String greetFormal(String name) {
        return greet("товарищ " + name);
    }
}
