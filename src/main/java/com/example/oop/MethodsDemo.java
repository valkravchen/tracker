package com.example.oop;

public class MethodsDemo {
    public static void main(String[] args) {
        User user1 = new User("Лев", 36);
        User user2 = new User("Фёдор", 56);
        System.out.println(user1.getDetails());
        System.out.println(user2.getDetails());
        user1.setAge(37);
        System.out.println(user1.getDetails());
    }
}
