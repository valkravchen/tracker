package com.example.oop.user;

public class User {
    private String username;
    private int age;

    public User(String username, int age) {
        this.username = validateUserName(username);
        this.age = validateAge(age);
    }

    protected User(String username) {
        this(username, 0);
    }

    private User(int age) {
        this("Anonymous", age);
    }

    User() {
        this("Guest", 0);
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public static User createWithPrivateConstructor(int age) {
        return new User(age);
    }

    private String validateUserName(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя пользователя не может быть null или пустой строкой");
        }
        return username;
    }

    private int validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        return age;
    }
}
