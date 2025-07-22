package com.example.oop.abstraction_34.experiment4;

public abstract class Manager extends Employee {
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.5;
    }

    abstract int getTeamSize();
}
