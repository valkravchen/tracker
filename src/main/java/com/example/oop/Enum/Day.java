package com.example.oop.Enum;

public enum Day {
    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNESDAY("Среда", 3),
    THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота", 6),
    SUNDAY("Воскресенье", 7);

    private final String russianName;
    private final int order;

    Day(String russianName, int order) {
        this.russianName = russianName;
        this.order = order;
    }

    public String getRussianName() {
        return russianName;
    }

    public boolean isWeekend() {
        return  this == SATURDAY || this == SUNDAY;
    }

    public static Day byOrder(int order) {
        for (Day day : values()) {
            if (day.order == order) {
                return day;
            }
        }
        throw new IllegalArgumentException("Неверный номер дня: " + order);
    }

    public static void main(String[] args) {
        System.out.println(SUNDAY.getRussianName());
        System.out.println(MONDAY.isWeekend());
        System.out.println(Day.byOrder(3));
    }
}
