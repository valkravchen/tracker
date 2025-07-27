package com.example.oop._48_strategyPattern_example_withPattern;

public class StrategyExample {
    public static void main(String[] args) {
        FamilyVacationPlanner planner = new FamilyVacationPlanner(new BudgetVacationStrategy());
        planner.createVacationPlan(7);
        System.out.println();
        planner.setStrategy(new LuxuryVacationStrategy());
        planner.createVacationPlan(10);
        System.out.println();
        planner.setStrategy(new StandardVacationStrategy());
        planner.createVacationPlan(5);
        System.out.println();
        planner.setStrategy(new EcoVacationStrategy());
        planner.createVacationPlan(8);
    }
}
