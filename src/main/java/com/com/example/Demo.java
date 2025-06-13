package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User("Шурик", 21);
        User user2 = new PremiumUser("Бывалый", 22);
        System.out.println(user1.getUserStatus());
        System.out.println(user2.getUserStatus());
    }
}
