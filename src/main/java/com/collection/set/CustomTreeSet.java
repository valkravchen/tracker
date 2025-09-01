package com.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class CustomTreeSet {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        students.add(new Student("Иван", 85));
        students.add(new Student("Мария", 92));
        students.add(new Student("Петр", 78));
        students.add(new Student("Анна", 95));

        System.out.println("=== СТУДЕНТЫ ПО ОЦЕНКАМ ===");
        System.out.println("Рейтинг студентов: " + students);
    }
}
