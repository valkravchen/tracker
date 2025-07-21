package com.example.oop.interfaces_28.experiment5;

public class Duck implements Swimmer, Flyer {
    @Override
    public String move() {
        return Swimmer.super.move() + " и " + Flyer.super.move();
    }

    public String moveDescription() {
        return "Утка универсальна: " + move();
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        System.out.println("Движение утки: " + duck.move());
        System.out.println("Описание движения: " + duck.moveDescription());
    }
}
