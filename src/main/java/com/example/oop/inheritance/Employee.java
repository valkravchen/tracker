package com.example.oop.inheritance;

public class Employee extends Person {
    public Employee(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Нина");
    }
}
