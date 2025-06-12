package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user2 = new User("Леопольд", 33);
        User user3 = new User(4, "Четвёртый");
        System.out.println("Имя: " + user3.getName() + "; возраст: " + user3.getAge());
    }
}
