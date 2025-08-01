package com.example.oop.patterns_decorator;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return pizza.cost() + 50;
    }

    @Override
    public String description() {
        return pizza.description() + ", сыр";
    }
}
