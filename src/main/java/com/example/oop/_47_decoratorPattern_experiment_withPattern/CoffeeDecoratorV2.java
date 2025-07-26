package com.example.oop._47_decoratorPattern_experiment_withPattern;

public abstract class CoffeeDecoratorV2 implements CoffeeV2 {
    protected CoffeeV2 coffeeV2;

    public CoffeeDecoratorV2(CoffeeV2 coffeeV2) {
        this.coffeeV2 = coffeeV2;
    }

    @Override
    public String getDescription() {
        return coffeeV2.getDescription();
    }

    @Override
    public double getCost() {
        return coffeeV2.getCost();
    }
}
