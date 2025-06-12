package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User("Леопольд");
        User user2 = new User(4);
        System.out.println("Имя: " + user1.getName() + "; возраст: " + user1.getAge());
        System.out.println("Имя: " + user2.getName() + "; возраст: " + user2.getAge());
        System.out.println("Счётчик: " + User.getIdCounter());
    }
}
