package com.example.oop._48_strategyPattern_example_withPattern;

public class FamilyVacationPlanner {
    private VacationStrategy strategy;

    public FamilyVacationPlanner(VacationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(VacationStrategy strategy) {
        this.strategy = strategy;
    }

    public void createVacationPlan(int days) {
        System.out.println(strategy.planVacation(days));
        System.out.println("Проживание: " + strategy.getAccommodation());
        System.out.println("Активности: " + strategy.getActivities());
    }
}
