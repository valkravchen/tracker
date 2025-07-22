package com.example.oop.abstraction_34.experiment1;

public abstract class Animal {
    abstract void makeSound();

    abstract void eat();

    public void sleep() {
        System.out.println("Животное спит");
    }
}
