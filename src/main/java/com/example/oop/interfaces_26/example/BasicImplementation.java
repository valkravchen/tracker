package com.example.oop.interfaces_26.example;

public class BasicImplementation implements com.example.oop.interfaces_26.example.BasicInterface {
    @Override
    public void process() {
        System.out.println("Кастомная обработка");
    }

    @Override
    public String getName() {
        return "Кастомная реализация";
    }
}
