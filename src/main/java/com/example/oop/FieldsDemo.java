package com.example.oop;

public class FieldsDemo {
    public static void main(String[] args) {
        System.out.println("idCounter: " + User.getIdCounter());
        User user1 = new User("Иван", 19);
        System.out.println("idCounter: " + User.getIdCounter());
        User user2 = new User("Александр", 25);
        System.out.println("idCounter: " + User.getIdCounter());
    }
}
