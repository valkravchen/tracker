package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Пионер", 9);
        System.out.println(user.getSelfDescription());
        user.resetProfile();
        System.out.println(user.getSelfDescription());
    }
}