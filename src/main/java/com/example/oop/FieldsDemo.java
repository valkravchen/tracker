package com.example.oop;

public class FieldsDemo {
    public static void main(String[] args) {
        User user1 = new User("Иван", 19);
        User user2 = new User("Александр",25);
        System.out.println("Имя пользователя 1: " + user1.getName()
                + "; возраст пользователя 1: " + user1.getAge());
        System.out.println("Имя пользователя 2: " + user2.getName()
                + "; возраст пользователя 2: " + user2.getAge());
    }
}
