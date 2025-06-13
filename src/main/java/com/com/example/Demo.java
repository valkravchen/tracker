package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User("Шурик", 21);
        User user2 = new User("Пионер", 9);
        user1.setActive(false);
        user2.setName("Октябрёнок");
        System.out.println(user1.getUserStatus());
        System.out.println(user2.getUserStatus());
        System.out.println(User.getIdCounter());
    }
}