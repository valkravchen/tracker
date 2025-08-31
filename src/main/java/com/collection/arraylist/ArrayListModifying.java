package com.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListModifying {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("яблоко", "банан", "апельсин", "банан", "груша"));
        System.out.println("Исходный список: " + fruits);
        String oldFruit = fruits.set(1, "киви");
        System.out.println("Заменили " + oldFruit + " на киви: " + fruits);
        String removed = fruits.remove(2);
        System.out.println("Удалили элемент " + removed + ": " + fruits);
        boolean wasRemoved = fruits.remove("банан");
        System.out.println("Удалили банан: " + wasRemoved + ", список: " + fruits);
        fruits.add("груша");
        System.out.println("Добавили грушу: " + fruits);
        fruits.removeAll(List.of("груша"));
        System.out.println("Удалили все груши: " + fruits);
        List<String> backup = new ArrayList<>(fruits);
        fruits.clear();
        System.out.println("После clear(): " + fruits);
        System.out.println("Backup сохранён: " + backup);
    }
}
