package com.example.oop._48_strategyPattern_example_withPattern;

public class EcoVacationStrategy implements VacationStrategy {
    @Override
    public String planVacation(int days) {
        return "Эко-отдых на " + days + " дней";
    }

    public String getAccommodation() {
        return "Эко-домик в лесу или глэмпинг";
    }

    public String getActivities() {
        return "Велопрогулки, йога, органическая еда, медитации";
    }
}
