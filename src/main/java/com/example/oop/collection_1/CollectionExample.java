package com.example.oop.collection_1;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        System.out.println(names);
        boolean found = names.contains("Bob");
        System.out.println("Bob найден: " + found);
        names.remove("Bob");
        System.out.println(names);
        System.out.println("Размер коллекции: " + names.size());
        System.out.println("Пустая ли коллекция: " + names.isEmpty());
        String firstPerson = names.get(0);
        System.out.println(firstPerson);
    }
}
