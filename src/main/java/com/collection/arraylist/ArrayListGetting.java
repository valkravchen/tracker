package com.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGetting {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.addAll(List.of("Java", "Python", "C++", "JavaScript", "Java"));
        System.out.println("Исходный список: " + languages);
        String first = languages.get(0);
        String last = languages.get(languages.size() - 1);
        System.out.println("Первый элемент: " + first);
        System.out.println("Последний элемент: " + last);
        int javaIndex = languages.indexOf("Java");
        int lastJavaIndex = languages.lastIndexOf("Java");
        System.out.println("Первый Java на позиции: " + javaIndex);
        System.out.println("Последний Java на позиции: " + lastJavaIndex);
        boolean hasPython = languages.contains("Python");
        boolean hasRust = languages.contains("Rust");
        System.out.println("Есть Python: " + hasPython);
        System.out.println("Есть Rust: " + hasRust);
        System.out.println("Список пустой: " + languages.isEmpty());
        System.out.println("Размер списка: " + languages.size());
        int index = 10;
        if (index >= 0 && index < languages.size()) {
            System.out.println("Элемент " + index + ": " + languages.get(index));
        } else {
            System.out.println("Индекс " + index + " выходит за границы списка");
        }
    }
}
