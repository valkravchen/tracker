package com.example.oop.multipleInheritance;

public class Both implements Left, Right {
    @Override
    public void speak() {
        System.out.println("Лево + право");
    }

    public static void main(String[] args) {
        Left left = new Both();
        Right right = new Both();
        left.speak();
        right.speak();
    }
}
