package com.example.oop._47_decoratorPattern_experiment_withPattern;

public class SimpleCoffeeV2 implements CoffeeV2 {
    @Override
    public String getDescription() {
        return "Простой кофе";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}
