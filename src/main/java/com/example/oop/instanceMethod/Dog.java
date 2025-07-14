package com.example.oop.instanceMethod;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("Гавкает " + name);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Бим");
        dog.bark();
    }
}
