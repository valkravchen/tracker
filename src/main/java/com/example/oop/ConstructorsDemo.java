package com.example.oop;

public class ConstructorsDemo {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        System.out.println("Имя пользователя: " + user1.getName() + "; возраст: " + user1.getAge());
        System.out.println("Имя пользователя: " + user2.getName() + "; возраст: " + user2.getAge());
        System.out.println("IdCounter: " + User.getIdCounter());
    }
}
