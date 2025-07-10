package com.example.oop.abstraction;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(String logLevel, String source) {
        super(logLevel, source);
    }

    @Override
    public String formatMessage(String message) {
        return "КОНСОЛЬ: " + message;
    }

    public static void main(String[] args) {
        ConsoleLogger console = new ConsoleLogger("ERROR", "AuthService");
        FileLogger file = new FileLogger("ERROR", "Database");
        console.log("Пользователь вошел в систему");
        file.logError("Ошибка подключения");
        AbstractLogger logger = new FileLogger("DEBUG", "Cache");
        logger.log("Тест кэша");
    }
}
