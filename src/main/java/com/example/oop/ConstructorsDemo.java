package com.example.oop;

public class ConstructorsDemo {
    public static void main(String[] args) {
        System.out.println("IdCounter: " + User.getIdCounter());
        User user1 = new User("Добрыня Никитич");
        System.out.println("IdCounter: " + User.getIdCounter());
        User user2 = new User("Илья Муромец");
        System.out.println("IdCounter: " + User.getIdCounter());
    }
}
