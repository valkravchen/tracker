package com.com.example;

public class Demo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        parent.parentMethod();
        child.parentMethod();
        child.childMethod();
    }
}
