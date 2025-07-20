package com.example.oop.interfaces.example;

public interface BasicInterface {
    String VERSION = "1.0";
    int MAX_SIZE = 100;

    void process();

    String getName();

    default void printInfo() {
        System.out.println("Версия: " + VERSION + ", максимальный размер: " + MAX_SIZE);
    }

    static BasicInterface createDefault() {
        return new BasicInterface() {
            @Override
            public void process() {
                System.out.println("Обработка по умолчанию");
            }

            @Override
            public String getName() {
                return "Реализация по умолчанию";
            }
        };
    }
}
