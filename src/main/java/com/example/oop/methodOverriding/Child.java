package com.example.oop.methodOverriding;

public class Child extends Parent {
    public static void display() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.display();
    }
}
