package com.example.oop;

public class InitBlock {
    private static String staticField;
    private String instanceField;

    static {
        staticField = "Инициализация статического поля";
    }

    {
        instanceField = "Инициализация нестатического поля";
    }

    public static void main(String[] args) {
        System.out.println(staticField);
    }
}
