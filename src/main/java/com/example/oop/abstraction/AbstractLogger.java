package com.example.oop.abstraction;

public abstract class AbstractLogger {
    protected final String logLevel;
    protected final String source;

    public AbstractLogger(String logLevel, String source) {
        this.logLevel = validateLogLevel(logLevel);
        this.source = validateSource(source);
    }

    abstract String formatMessage(String message);

    public void log(String message) {
        System.out.println(logLevel + " " + source + ": " + formatMessage(message));
    }

    public void logError(String errorDetails) {
        if (logLevel.equals("ERROR")) {
            log(errorDetails);
        }
    }

    private String validateLogLevel(String level) {
        if (!level.equals("INFO") && !level.equals("DEBUG") && !level.equals("ERROR")) {
            throw new IllegalArgumentException("Недопустимый уровень логирования: " +
                    level + ". Допустимые значения: INFO, DEBUG, ERROR");
        }
        return level;
    }

    private String validateSource(String source) {
        if (source == null || source.trim().isEmpty()) {
            throw new IllegalArgumentException("Источник лога не может быть null или пустым");
        }
        return source.trim();
    }
}
