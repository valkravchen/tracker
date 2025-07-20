package com.example.oop.interfaces.experiment2;

import java.time.LocalTime;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[" + LocalTime.now() + "] " + message);
    }

    public static void main(String[] args) {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        consoleLogger.info("Приложение запущено");
        consoleLogger.error("Ошибка подключения");
        consoleLogger.debug("Отладочная информация");
    }
}
