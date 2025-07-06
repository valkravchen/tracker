package com.example.oop.Inheritance;

public interface DataProcessor {
    public static final int MAX_DATA_LENGTH = 100;

    public abstract String process();

    public default String getInfo() {
        return "Информация о процессоре данных";
    }

    public static String getVersion() {
        return "Версия процессора: 1.0";
    }

}
