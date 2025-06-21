package com.com.example;

public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Гав!");
    }

    @Override
    void eat() {
        System.out.println("Есть косточки");
    }
}
