package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User("Буратино", 10);
        User user2 = new User();
        System.out.println(user1.getProfile());
        System.out.println(user2.getProfile());
    }
}