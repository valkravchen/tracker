package com.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class ComparableDemo {
    public static void main(String[] args) {
        Set<String> cities = new TreeSet<>();
        cities.add("Москва");
        cities.add("Казань");
        cities.add("Санкт-Петербург");
        cities.add("Екатеринбург");
        System.out.println("=== СОРТИРОВКА СТРОК ===");
        System.out.println("Города в алфавитном порядке: " + cities);
        Set<Integer> scores = new TreeSet<>();
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(95);
        scores.add(88);
        System.out.println("\n=== СОРТИРОВКА ЧИСЕЛ ===");
        System.out.println("Баллы по возрастанию: " + scores);
        try {
            cities.add(null);
        } catch (NullPointerException e) {
            System.out.println("\nОшибка: TreeSet не принимает null элементы");
        }
    }
}
