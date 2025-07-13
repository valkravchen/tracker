package com.example.oop.constructor;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Шарик");
        System.out.println(dog.getName());
    }
}
