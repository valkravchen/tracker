package com.com.example;

public class Demo {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("Буратино");
        System.out.println(simpleUser.getClass().getSuperclass());
    }
}