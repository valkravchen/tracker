package com.example.oop.multipleInheritance;

public class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Кошка мяукает");
    }

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.speak();
    }
}
