package com.example.oop;

public class NestedClassesDemo {
    public static void main(String[] args) {
        User.StaticNested nested = new User.StaticNested();
        nested.display();
        User user = new User("Семён Семёныч", 40);
        nested.display();
    }
}
