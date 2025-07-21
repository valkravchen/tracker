package com.example.oop.interfaces_28.experiment4;

public class EnglishGreeter implements Greeter {
    @Override
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
