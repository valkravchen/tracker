package com.example.oop.abstraction_31.experiment4;

public abstract class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double baseSalary, int teamSize) {
        super(name, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    public String getJobDescription() {
        return "Руководитель команды из " + teamSize + " человек";
    }

    public int getTeamSize() {
        return teamSize;
    }
}
