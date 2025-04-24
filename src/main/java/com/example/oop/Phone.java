package com.example.oop;

public class Phone {
    private String model;
    public Phone(String model) {
        this.model = model;
    }

    public void call() {
        System.out.println(model + " звонит");
    }
}
