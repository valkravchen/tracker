package com.example.oop;

public class Parent {
    static void print() {
        System.out.println("Parent");
    } // Статический метод

    String value = "Parent";

    static class StaticNested {
        void display() {
            print();
            System.out.println();
        }
    }// Переменная экземпляра
}
