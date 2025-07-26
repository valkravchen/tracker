package com.example.oop._48_strategyPattern_example_withPattern;

public class BudgetVacationStrategy implements VacationStrategy {
    @Override
    public String planVacation(int days) {
        return "Бюджетный отдых на " + days + " дней";

    }

    @Override
    public String getAccommodation() {
        return "Дача у родственников или кемпинг";
    }

    @Override
    public String getActivities() {
        return "Шашлыки, рыбалка, походы в лес, настольные игры";
    }
}
