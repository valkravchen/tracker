package com.example.oop._48_strategyPattern_example_withoutPattern;

public class VacationPlanner {
    public void planVacation(int budget, int days) {
        if (budget < 50000) {
            System.out.println("Бюджетный отдых на " + days + " дней");
            System.out.println("Дача у родственников или кемпинг");
            System.out.println("Шашлыки, рыбалка, походы в лес, настольные игры");
        } else if (budget < 150000) {
            System.out.println("Стандартный отдых на " + days + " дней");
            System.out.println("Гостиница 3* в курортном городе");
            System.out.println("Экскурсии, музеи, кафе, пляж");
        } else {
            System.out.println("Роскошный отдых на " + days + " дней");
            System.out.println("5-звездочный отель на морском курорте");
            System.out.println("Спа, дайвинг, рестораны, персональные экскурсии");
        }
    }
}
