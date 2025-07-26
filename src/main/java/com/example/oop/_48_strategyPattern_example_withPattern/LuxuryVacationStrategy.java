package com.example.oop._48_strategyPattern_example_withPattern;

public class LuxuryVacationStrategy implements VacationStrategy {
    @Override
    public String planVacation(int days) {
        return "Роскошный отдых на " + days + " дней";
    }

    @Override
    public String getAccommodation() {
        return "5-звездочный отель на морском курорте";
    }

    @Override
    public String getActivities() {
        return "Спа, дайвинг, рестораны, персональные экскурсии";
    }
}
