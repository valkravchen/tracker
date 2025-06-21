package com.com.example;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Мяу!");
            }
        };

        cat.makeSound();
    }
}
