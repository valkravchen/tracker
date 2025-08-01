package com.example.oop.patterns_decorator;

public class MushroomsDecorator extends PizzaDecorator {
    public MushroomsDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return pizza.cost() + 80;
    }

    @Override
    public String description() {
        return pizza.description() + ", грибы";
    }
}
