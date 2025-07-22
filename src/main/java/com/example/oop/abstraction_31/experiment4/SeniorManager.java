package com.example.oop.abstraction_31.experiment4;

public class SeniorManager extends Manager {
    public SeniorManager(String name, double baseSalary, int teamSize) {
        super(name, baseSalary, teamSize);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (getTeamSize() * 1000);
    }

    public static void main(String[] args) {
        SeniorManager seniorManager = new SeniorManager("Иван Петров", 50000, 8);
        seniorManager.displayInfo();
        System.out.println("Описание работы: " + seniorManager.getJobDescription());
        System.out.println("Итоговая зарплата: " + seniorManager.calculateSalary());
    }
}
