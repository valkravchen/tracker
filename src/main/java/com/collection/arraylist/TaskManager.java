package com.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        System.out.println("=== СИСТЕМА УПРАВЛЕНИЯ ЗАДАЧАМИ ===\n");
        tasks.add("Изучить ArrayList");
        tasks.add("Сделать домашнее задание");
        tasks.add("Прочитать документацию");
        tasks.add("Написать тестовую программу");

        printTasks(tasks);
        tasks.add(0, "СРОЧНО: Исправить баг в проекте");
        System.out.println("\nДобавили срочную задачу:");
        printTasks(tasks);
        String oldTask = tasks.set(2, "Изучить ArrayList глубоко");
        System.out.println("\nЗаменили задачу '" + oldTask + "':");
        printTasks(tasks);
        System.out.println("\nВыполняем задачи...");
        while (!tasks.isEmpty()) {
            String completeTask = tasks.remove(0);
            System.out.println("Выполнено: " + completeTask);
            System.out.println("Осталось задач: " + tasks.size());
        }
        System.out.println("\nВсе задачи выполнены!");
    }

    public static void printTasks(List<String> tasks) {
        System.out.println("Список задач (" + tasks.size() + " шт.):");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + tasks.get(i));

        }
    }
}
