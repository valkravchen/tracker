package com.example.oop.Decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", с молоком";
    }

    @Override
    public double getCoast() {
        return super.getCoast() + 30.0;
    }
}
