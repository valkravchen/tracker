package com.example.oop.abstraction_35.experiment1;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();
}
