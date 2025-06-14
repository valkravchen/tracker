package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User("Пионер", 9);
        User user2 = new User("Буратино", 5);
        System.out.println(user1.getDetailedStatus());
        System.out.println(user2.getDetailedStatus());
    }
}