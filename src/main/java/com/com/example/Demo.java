package com.com.example;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User("Леопольд", 33);
        User user3 = new User("Ярослав");
        System.out.println("Имя пользователя: " + user1.getName()
                + "; возраст пользователя: " + user1.getAge());
        System.out.println("Имя пользователя: " + user2.getName()
                + "; возраст пользователя: " + user2.getAge());
        System.out.println("Имя пользователя: " + user3.getName()
                + "; возраст пользователя: " + user3.getAge());
        System.out.println("Счётчик: " + User.getIdCounter());
    }
}
