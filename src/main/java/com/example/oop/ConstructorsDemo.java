package com.example.oop;

public class ConstructorsDemo {
    public static void main(String[] args) {
        User user1 = new User("Емеля", 25);
        User user2 = new User();
        System.out.println(user1.getName() + ", " + user1.getAge());
        System.out.println(user2.getName() + ", " + user2.getAge());
        System.out.println("Счётчик: " + User.getIdCounter());
    }
}
