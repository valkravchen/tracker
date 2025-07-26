package com.example.oop._47_decoratorPattern_experiment_withPattern;

public class SugarDecoratorV2 extends CoffeeDecoratorV2 {
    public SugarDecoratorV2(CoffeeV2 coffeeV2) {
        super(coffeeV2);
    }

    @Override
    public String getDescription() {
        return coffeeV2.getDescription() + " с сахаром";
    }

    @Override
    public double getCost() {
        return coffeeV2.getCost() + 5.0;
    }
}
