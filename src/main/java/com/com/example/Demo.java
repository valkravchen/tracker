package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Шурик", 21);
        System.out.println(user.getProfile());
        user.updateProfile("Шурик Ы", 22, false);
        System.out.println(user.getProfile());
        System.out.println(user.isActive());
    }
}
