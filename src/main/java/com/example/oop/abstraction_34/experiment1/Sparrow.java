package com.example.oop.abstraction_34.experiment1;

public class Sparrow extends Bird {
    @Override
    public void eat() {
        System.out.println("Воробей клюет зерна");
    }

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.makeSound();
        sparrow.eat();
        sparrow.sleep();
    }
}

