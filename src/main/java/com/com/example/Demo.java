package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User("Буратино", 10);
        User user2 = new User("Карабас", 29);
        System.out.println(user1.getObjectReference());
        System.out.println(user2.getObjectReference());
    }
}