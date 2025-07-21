package com.example.oop.interfaces_28.experiment4;

public class RobotGreeter implements Greeter {
    @Override
    public String greet(String name) {
        return "BEEP-BOOP. HELLO " + name.toUpperCase() + ". BEEP-BOOP";
    }

    @Override
    public String greetFormal(String name) {
        return greet("UNIT-" + name.toUpperCase());
    }

    public static void main(String[] args) {
        EnglishGreeter englishGreeter = new EnglishGreeter();
        RobotGreeter robotGreeter = new RobotGreeter();
        System.out.println("=== English Greeter ===");
        System.out.println("Обычное приветствие: " + englishGreeter.greet("Анна"));
        System.out.println("Формальное приветствие: " + englishGreeter.greetFormal("Анна"));
        System.out.println();
        System.out.println("=== Robot Greeter ===");
        System.out.println("Обычное приветствие: " + robotGreeter.greet("Анна"));
        System.out.println("Формальное приветствие: " + robotGreeter.greetFormal("Анна"));
    }
}
