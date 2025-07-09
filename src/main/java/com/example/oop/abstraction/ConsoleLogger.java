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
        console.log("Пользователь вошел в систему");
    }
}
