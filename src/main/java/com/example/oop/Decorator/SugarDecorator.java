package com.example.oop.Decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", с сахаром";
    }

    @Override
    public double getCoast() {
        return super.getCoast() + 10.0;
    }
}
