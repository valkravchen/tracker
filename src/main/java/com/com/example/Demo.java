package com.com.example;

public class Demo {
    public static void main(String[] args) {
        Child child = new Child(33);
        System.out.println("Имя: " + child.getName() + "; возраст: " + child.getAge());
    }
}
