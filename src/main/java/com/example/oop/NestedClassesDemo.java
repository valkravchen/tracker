package com.example.oop;

public class NestedClassesDemo {
    public static void main(String[] args) {
        User user = new User("Семён Семёныч", 40);
        Runnable anon = user.createAnonymousClass();
        anon.run();
    }
}
