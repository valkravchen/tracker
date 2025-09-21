package com.collection.step51;

import java.util.ArrayList;
import java.util.Date;

public class NoTypeSafetyProblem {
    private ArrayList studentNames;
    private ArrayList studentGrades;
    private int runtimeErrors = 0;

    public NoTypeSafetyProblem() {
        studentNames = new ArrayList<>();
        studentGrades = new ArrayList();
    }

    public void demonstrateTypeSafetyProblem() {
        System.out.println("=== ДЕМОНСТРАЦИЯ ОТСУТСТВИЯ БЕЗОПАСНОСТИ ТИПОВ ===\n");
        studentNames.add("Иван Петров");
        studentNames.add("Мария Сидорова");
        studentNames.add(123);
        studentNames.add(new Date());
        studentNames.add(Boolean.TRUE);
        System.out.println("В список имен добавлено: " + studentNames.size() + " элементов");
        System.out.println("Типы добавленных объектов:");
        for (Object object : studentNames) {
            System.out.println("  - " + object.getClass().getSimpleName() + ": " + object);
        }
        System.out.println("\n!!! ПОПЫТКА ОБРАБОТАТЬ КАК СТРОКИ !!!");
        for (int i = 0; i < studentNames.size(); i++) {
            try {
                String name = (String) studentNames.get(i);
                System.out.println("Студент " + i + ": " + name.toUpperCase());
            } catch (ClassCastException e) {
                runtimeErrors++;
                System.out.println("ОШИБКА! Элемент " + i + " не является String: " +
                        studentNames.get(i).getClass().getSimpleName());
            }
        }
        System.out.println("\nОшибок времени выполнения: " + runtimeErrors);
    }

    public static void main(String[] args) {
        NoTypeSafetyProblem noTypeSafetyProblem = new NoTypeSafetyProblem();
        noTypeSafetyProblem.demonstrateTypeSafetyProblem();
    }
}
