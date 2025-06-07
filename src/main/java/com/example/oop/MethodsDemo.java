package com.example.oop;

public class MethodsDemo {
    public static void main(String[] args) {
        System.out.println("IdCounter: " + User.getIdCounter());
        User user1 = new User("Лев", 36);
        System.out.println("IdCounter: " + User.getIdCounter());
        User user2 = new User("Фёдор", 56);
        System.out.println("IdCounter: " + User.getIdCounter());
    }
}
