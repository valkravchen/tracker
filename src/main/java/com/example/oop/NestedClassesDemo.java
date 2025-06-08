package com.example.oop;

public class NestedClassesDemo {
    public static void main(String[] args) {
        User user = new User("Семён Семёныч", 40);
        User.Inner inner =user.new Inner();
        inner.display();
    }
}
