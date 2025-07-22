package com.example.oop.abstraction_31.experiment4;

public abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public abstract String getJobDescription();

    public void displayInfo() {
        System.out.println("Сотрудник: " + name + ", Базовая зарплата: " + baseSalary);
    }
}
