package com.example.oop._47_decoratorPattern_experiment_withPattern;

public class MilkDecoratorV2 extends CoffeeDecoratorV2 {
    public MilkDecoratorV2(CoffeeV2 coffeeV2) {
        super(coffeeV2);
    }

    @Override
    public String getDescription() {
        return coffeeV2.getDescription() + " c молоком";
    }

    @Override
    public double getCost() {
        return coffeeV2.getCost() + 10.0;
    }
}
