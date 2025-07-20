package com.example.oop.interfaces_26.experiment2;

import java.time.LocalTime;

public class ConsoleLogger implements com.example.oop.interfaces_26.experiment2.Logger {
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
