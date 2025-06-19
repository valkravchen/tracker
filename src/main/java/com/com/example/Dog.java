package com.com.example;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " лает: Гав-гав!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(name + " быстро съел корм.");
    }
}
