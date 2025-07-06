package com.example.oop.Inheritance;

public interface Loggable {
    public abstract String log(String message);

    public default String getLogInfo() {
        return "Информация о логгере";
    }
}
