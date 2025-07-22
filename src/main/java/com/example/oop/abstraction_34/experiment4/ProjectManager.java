package com.example.oop.abstraction_34.experiment4;

public class ProjectManager extends Manager {
    private int teamSize;

    public ProjectManager(String name, double baseSalary, int teamSize) {
        super(name, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    public int getTeamSize() {
        return teamSize;
    }

    public static void main(String[] args) {
        ProjectManager projectManager = new ProjectManager("Иван Петров", 100000, 5);
        System.out.println("Менеджер: " + projectManager.getName());
        System.out.println("Зарплата: " + projectManager.calculateSalary());
        System.out.println("Размер команды: " + projectManager.getTeamSize());
    }
}
