package com.example.oop.multipleInheritance;

public class Human implements Walkable, Runnable {
    @Override
    public void move() {
        System.out.println("Человек движется");
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.move();
    }
}
