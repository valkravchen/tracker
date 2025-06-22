package com.example.oop.Enum;

public class Main {
    public static void main(String[] args) {
        Day today = Day.SUNDAY;
        System.out.println(today);
        System.out.println(today.getRussianName());
        System.out.println(today.isWeekend());
        Day day7 = Day.byOrder(7);
        System.out.println(day7);
        Color.RED.print();
        Color.GREEN.print();
    }
}
