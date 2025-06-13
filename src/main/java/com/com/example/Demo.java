package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Шурик", 21);
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.isActive());
    }
}
