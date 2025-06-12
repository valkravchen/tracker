package com.com.example;

public class Demo {
    public static void main(String[] args) {
        System.out.println(User.getIdCounter());
        User user = new User("Бабай", 0);
        System.out.println(User.getIdCounter());
        User.resetCounter();
        System.out.println(User.getIdCounter());
    }
}
