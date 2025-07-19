package com.example.oop.interfaces;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }

    @Override
    public void eat(String food) {
        System.out.println("Собака ест " + food);
    }
}
