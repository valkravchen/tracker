package com.example.oop._48_strategyPattern_example_withPattern;

public interface VacationStrategy {
    String planVacation(int days);

    String getAccommodation();

    String getActivities();
}
