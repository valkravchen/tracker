package com.com.example;

public class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Мяу!");
    }

    @Override
    void eat() {
        System.out.println("Есть рыбу");
    }
}

