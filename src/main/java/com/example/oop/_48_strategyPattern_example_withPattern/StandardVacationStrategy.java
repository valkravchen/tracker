package com.example.oop._48_strategyPattern_example_withPattern;

public class StandardVacationStrategy implements VacationStrategy {
    @Override
    public String planVacation(int days) {
        return "Стандартный отдых на " + days + " дней";
    }

    @Override
    public String getAccommodation() {
        return "Гостиница 3* в курортном городе";
    }

    public String getActivities() {
        return "Экскурсии, музеи, кафе, пляж";
    }
}

