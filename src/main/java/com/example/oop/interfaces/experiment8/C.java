package com.example.oop.interfaces.experiment8;

public class C implements A, B {
    @Override
    public void greet() {
        A.super.greet();
        B.super.greet();
        System.out.println("Привет от C");
    }

    public static void main(String[] args) {
        C object = new C();
        object.greet();
    }
}
