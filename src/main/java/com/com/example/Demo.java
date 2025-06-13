package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User("Шурик", 21);
        System.out.println(user1.getAge());
        user1.setAge(-5);
        System.out.println(user1.getAge());
    }
}
