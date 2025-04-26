package com.example.oop;

public class Part {
    private String type;

    public Part(String type) {
        this.type = type;
    }

    public void assemble() {
        System.out.println("Собираю " + type);
    }
}
