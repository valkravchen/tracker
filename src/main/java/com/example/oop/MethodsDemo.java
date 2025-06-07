package com.example.oop;

public class MethodsDemo {
    public static void main(String[] args) {
        User user1 = new User("Лев", 36);
        System.out.println(user1.getIdCounter());
        user1.resetCounter();
        System.out.println(user1.getIdCounter());
    }
}
