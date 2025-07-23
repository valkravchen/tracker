package com.example.oop.abstraction_35.experiment2;

public interface Configurable {
    String DEFAULT_FORMAT = "JSON";

    String getConfigValue(String key);

    default void printConfig(String key) {
        System.out.println("Конфигурация " + key + ": " + getConfigValue(key));
        logAccess(key);
    }

    static String getDefaultFormat() {
        return DEFAULT_FORMAT;
    }

    private void logAccess(String key) {
        System.out.println("Лог: обращение к ключу " + key);
    }
}
