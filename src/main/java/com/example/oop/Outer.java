package com.example.oop;

public class Outer {
    private String outerField = "Поле внешнего класса";
    private static String staticField = "Статическое поле";

    public class Inner {
        public void print() {
            System.out.println(outerField);
            System.out.println(staticField);
        }
    }
}
