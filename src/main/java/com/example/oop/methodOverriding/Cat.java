package com.example.oop.methodOverriding;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает");
    }

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.makeSound();
    }
}
