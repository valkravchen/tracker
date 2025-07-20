package com.example.oop.interfaces.example;

public class BasicImplementation implements BasicInterface{
    @Override
    public void process() {
        System.out.println("Кастомная обработка");
    }

    @Override
    public String getName() {
        return "Кастомная реализация";
    }
}
