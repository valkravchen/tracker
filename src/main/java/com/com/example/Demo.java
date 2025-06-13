package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User("Первый пользователь", 22);
        User user2 = new User("Второй пользователь", 18);
        System.out.println(user1.getInfo());
        System.out.println(user2.getInfo());
    }
}
