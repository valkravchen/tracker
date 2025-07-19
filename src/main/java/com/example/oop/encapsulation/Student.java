package com.example.oop.encapsulation;

public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        if (age < 16 || age > 100) {
            throw new IllegalArgumentException("Возраст должен быть от 16 до 100");
        }
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("Средний балл должен быть от 0.0 до 4.0");
        }

        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 16 || age > 100) {
            throw new IllegalArgumentException("Возраст должен быть от 16 до 100");
        }
        this.age = age;
    }

    public void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("Средний балл должен быть от 0.0 до 4.0");
        }
        this.gpa = gpa;
    }

    public String toString() {
        return "Студент: " + name + ", возраст: " + age + ", средний балл: " + gpa;
    }

    public static void main(String[] args) {
        Student student = new Student("Иван Иванов", 20, 3.8);
        System.out.println(student.toString());
        student.setAge(21);
        System.out.println(student.toString());
    }
}
