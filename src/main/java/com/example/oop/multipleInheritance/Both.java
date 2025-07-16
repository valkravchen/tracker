package com.example.oop.multipleInheritance;

public class Both implements Left, Right {
    @Override
    public void speak() {
        Left.super.speak();
    }

    public static void main(String[] args) {
        Left left = new Both();
        Right right = new Both();
        left.speak();
        right.speak();
    }
}
