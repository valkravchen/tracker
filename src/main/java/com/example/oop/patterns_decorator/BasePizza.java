package com.example.oop.patterns_decorator;

public class BasePizza implements Pizza {
    @Override
    public int cost() {
        return 300;
    }

    @Override
    public String description() {
        return "Базовая пицца";
    }
}
