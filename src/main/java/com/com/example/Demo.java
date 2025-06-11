package com.com.example;

public class Demo {
    public static void main(String[] args) {
        Child child1 = new Child("Добрыня", 33);
        System.out.println("Имя: " + child1.getName() + "; возраст: " + child1.getAge());
        Child child2 = new Child();
        System.out.println("Имя: " + child2.getName() + "; возраст: " + child2.getAge());
    }
}
