package com.example.oop.patterns_decorator;

public class SausageDecorator extends PizzaDecorator {
    public SausageDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return pizza.cost() + 100;
    }

    @Override
    public String description() {
        return pizza.description() + ", колбаса";
    }
}
