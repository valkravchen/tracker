package com.example.oop.Enum;

public class Main {
    public static void main(String[] args) {
        Day today = Day.SUNDAY;
        System.out.println(today);
        System.out.println(today.getRussianName());
        System.out.println(today.isWeekend());
    }
}
