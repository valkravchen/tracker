package com.example.oop.abstraction_34.experiment4;

public abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    public String getName() {
        return name;
    }
}
