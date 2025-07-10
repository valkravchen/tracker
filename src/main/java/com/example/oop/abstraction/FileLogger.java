package com.example.oop.abstraction;

public class FileLogger extends AbstractLogger {
    public FileLogger(String logLevel, String source) {
        super(logLevel, source);
    }

    @Override
    public String formatMessage(String message) {
        return "КОНСОЛЬ: " + message.toUpperCase();
    }
}
