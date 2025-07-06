package com.example.oop.test;

import com.example.oop.user.User;

public class UserTester {
    public static void main(String[] args) {
        User user1 = new User("Alice", 25);
        User user2 = User.createWithPrivateConstructor(30);
        System.out.println(user1.getUsername());
        System.out.println(user1.getAge());
        System.out.println(user2.getUsername());
        System.out.println(user2.getAge());
    }
}
