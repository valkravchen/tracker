package com.example.oop.interfaces_27.experiment6;

public interface Logger {
    void log(String message);

    default void info(String msg) {
        log("INFO: " + msg);
    }

    default void error(String msg) {
        log("ERROR: " + msg);
    }

    public static void main(String[] args) {
        Logger consoleLogger = new Logger() {
            @Override
            public void log(String message) {
                System.out.println(message);
            }
        };
        Logger prefixLogger = new Logger() {
            @Override
            public void log(String message) {
                System.out.println(message);
            }

            @Override
            public void info(String msg) {
                log(">>> " + msg);
            }
        };
        System.out.println("=== Console Logger ===");
        consoleLogger.info("Запуск приложения");
        consoleLogger.error("Ошибка подключения");
        System.out.println();
        System.out.println("=== Prefix Logger ===");
        prefixLogger.info("Запуск приложения");
        prefixLogger.error("Ошибка подключения");
    }
}
