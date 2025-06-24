package com.example.oop;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = validateAge(age) ? age : 18;
    }

    public Student(String name) {
        this.name = name;
        this.age = 18;
    }

    public Student() {
        this.name = "Безымянный";
        this.age = 18;
    }

    public void introduce() {
        System.out.println("Имя: " + name + "; возраст: " + age);
    }

    private boolean validateAge(int age) {
        return age >= 0;
    }

    public static void main(String[] args) {
        Student student = new Student("Ратибор", -300);
        student.introduce();
    }
}
