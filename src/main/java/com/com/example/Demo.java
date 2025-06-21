package com.com.example;

public class Demo {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.makeSound();
        dog.makeSound();
        cat.eat();
        dog.eat();
    }
}
