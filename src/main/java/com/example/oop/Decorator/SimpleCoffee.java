package com.example.oop.Decorator;

public class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Простой кофе";
    }

    public double getCoast() {
        return 100.0;
    }
}
