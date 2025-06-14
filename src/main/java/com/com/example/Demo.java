package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User("Буратино", 5);
        System.out.println(user1.getProfile());
        user1.printThis();
        User user2 = new User();
        System.out.println(user2.getProfile());
        user2.printThis();
    }
}