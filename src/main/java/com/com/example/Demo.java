package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Шурик", 21);
        user.setName(null);
        System.out.println(user.getUserStatus());
    }
}