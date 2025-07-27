package com.example.oop._52_record_example;

public class University {
    void demonstrateRecordBenefit() {
        StudentInfo student1 = new StudentInfo("Иванов", 20, "Информатика");
        StudentInfo student2 = new StudentInfo("Иванов", 20, "Информатика");
        System.out.println("Студенты равны: " + student1.equals(student2));
        System.out.println("Информация: " + student1.toString());
    }

    public static void main(String[] args) {
        University university = new University();
        university.demonstrateRecordBenefit();
    }
}
