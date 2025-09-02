package com.collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetNavigation {
    public static void main(String[] args) {
        NavigableSet<Integer> scores = new TreeSet<>();
        scores.add(65);
        scores.add(78);
        scores.add(92);
        scores.add(95);
        scores.add(85);
        System.out.println("=== НАВИГАЦИЯ ПО TREESET ===\n");
        System.out.println("Все баллы: " + scores);
        System.out.println("Минимальный балл: " + scores.first());
        System.out.println("Максимальный балл: " + scores.last());
        System.out.println("\nНавигация относительно 80:");
        System.out.println("Ближайший меньший или равный 80: " + scores.floor(80));
        System.out.println("Ближайший больший или равный 80: " + scores.ceiling(80));
        System.out.println("Ближайший строго меньший 80: " + scores.lower(80));
        System.out.println("Ближайший строго больший 80: " + scores.higher(80));
        System.out.println("\nПодмножества:");
        System.out.println("Баллы от 78 до 92: " + scores.subSet(78, 93));
        System.out.println("Баллы меньше 85: " + scores.headSet(85));
        System.out.println("Баллы от 85 и выше: " + scores.tailSet(85));
    }
}
