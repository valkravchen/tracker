package com.example.oop;

public class ConstructorsDemo {
    public static void main(String[] args) {
        User user1 = new User("Кощей");
        User user2 = new User("Леший", 333);
        System.out.println(user1.getName() + ", " + user1.getAge());
        System.out.println(user2.getName() + ", " + user2.getAge());
        System.out.println("Счётчик: " + User.getIdCounter());
    }
}
