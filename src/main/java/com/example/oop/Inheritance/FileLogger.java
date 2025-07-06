package com.example.oop.Inheritance;

public class FileLogger implements Loggable {
    private final String logFile;

    public FileLogger(String logFile) {
        this.logFile = validateLogFile(logFile);
    }

    @Override
    public String log(String message) {
        validateMessage(message);
        return "Логирование в |" + logFile + "|: Hello";
    }

    @Override
    public String getLogInfo() {
        return "Информация о логгере: FileLogger для |" + logFile + "|";
    }

    public String getDefaultLogInfo() {
        return Loggable.super.getLogInfo();
    }

    public String getLogFile() {
        return logFile;
    }

    private String validateLogFile(String logFile) {
        if (logFile == null || logFile.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя файла лога не может быть null или пустой строкой");
        }
        return logFile;
    }

    private void validateMessage(String message) {
        if (message == null || message.trim().isEmpty()) {
            throw new IllegalArgumentException("Сообщение не может быть null или пустой строкой");
        }
    }
}
