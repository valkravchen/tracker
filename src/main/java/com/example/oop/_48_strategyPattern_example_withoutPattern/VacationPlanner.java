package com.example.oop._48_strategyPattern_example_withoutPattern;

public class VacationPlanner {
    public String planVacation(int budget, int days) {
        if (budget < 50000) {
          return   "Бюджетный отдых на " + days + " дней";
        } else if (budget < 150000) {
           return "Стандартный отдых на " + days + " дней";
        } else {
           return  "Роскошный отдых на " + days + " дней";
        }
    }
}
