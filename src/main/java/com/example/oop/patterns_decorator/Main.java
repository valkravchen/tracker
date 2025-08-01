package com.example.oop.patterns_decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new SausageDecorator(new BasePizza());
        System.out.println(pizza.description());
        System.out.println(pizza.cost());
    }
}
