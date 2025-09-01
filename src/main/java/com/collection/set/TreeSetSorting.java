package com.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSorting {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        System.out.println("=== АВТОМАТИЧЕСКАЯ СОРТИРОВКА ===\n");
        numbers.add(25);
        numbers.add(10);
        numbers.add(50);
        numbers.add(15);
        numbers.add(30);
        numbers.add(10);
        System.out.println("Добавили: 25, 10, 50, 15, 30, 10");
        System.out.println("TreeSet результат: " + numbers);
        System.out.println("Размер: " + numbers.size());

        Set<Integer> hashNumbers = new HashSet<>();
        hashNumbers.add(25);
        hashNumbers.add(10);
        hashNumbers.add(50);
        hashNumbers.add(15);
        hashNumbers.add(30);
        System.out.println("\nДля сравнения HashSet " + hashNumbers);
        System.out.println("Видна разница в порядке элементов!");
    }
}
