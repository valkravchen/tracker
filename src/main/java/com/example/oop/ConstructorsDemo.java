package com.example.oop;

public class ConstructorsDemo {
    public static void main(String[] args) {
        User user1 = new User("Добрыня");
        System.out.println("Имя пользователя: " + user1.getName() + "; возраст: " + user1.getAge());
        System.out.println("IdCounter: " + User.getIdCounter());
    }
}
