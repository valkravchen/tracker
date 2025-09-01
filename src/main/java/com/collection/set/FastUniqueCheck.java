package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class FastUniqueCheck {
    public static void main(String[] args) {
        Set<String> registeredUsers = new HashSet<>();
        registeredUsers.add("ivan123");
        registeredUsers.add("maria_dev");
        registeredUsers.add("peter_admin");
        System.out.println("=== РЕГИСТРАЦИЯ ПОЛЬЗОВАТЕЛЕЙ ===\n");
        System.out.println("Зарегистрированные пользователи: " + registeredUsers);
        checkUsername(registeredUsers, "ivan123");
        checkUsername(registeredUsers, "new_user");
        checkUsername(registeredUsers, "maria_dev");
        checkUsername(registeredUsers, "admin2024");
        registerUser(registeredUsers, "admin2024");
        registerUser(registeredUsers, "ivan123");
        System.out.println("Зарегистрированные пользователи: " + registeredUsers);
    }

    public static void checkUsername(Set<String> users, String username) {
        if (users.contains(username)) {
            System.out.println("Имя '" + username + "' уже занято");
        } else {
            System.out.println("Имя '" + username + "' доступно");
        }
    }

    public static void registerUser(Set<String> users, String username) {
        boolean added = users.add(username);
        if (added) {
            System.out.println("Пользователь '" + username + "' успешно зарегистрирован");
        } else {
            System.out.println("Ошибка: пользователь '" + username + "' уже существует");
        }
    }
}
