package com.example.oop.nheritance;

public class Employee extends Person {
    public Employee(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Нина");
    }
}
