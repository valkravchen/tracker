package com.example.oop.Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " = " + coffee.getCoast() + " руб.");
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " = " + coffee.getCoast() + " руб.");
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " = " + coffee.getCoast() + " руб.");
    }
}
