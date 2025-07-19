package com.example.oop.interfaces;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает");
    }

    @Override
    public void eat(String food) {
        System.out.println("Кошка ест " + food);
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        dog.eat("корм");
        cat.makeSound();
        cat.eat("рыбу");
    }
}
