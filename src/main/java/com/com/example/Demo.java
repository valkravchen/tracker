package com.com.example;

public class Demo {
    public static void main(String[] args) {
        java.util.ArrayList<Object> list = new java.util.ArrayList<>();
        list.add(new User("Буратино", 10));
        list.add("Строка");
        list.add(42);
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
