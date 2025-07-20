package com.example.oop.interfaces.experiment4;

import java.time.LocalDateTime;

public interface DataValidator {
    boolean validate(String data);

    private String getCurrentTime() {
        return LocalDateTime.now().toString();
    }

    private void log(String message) {
        System.out.println("[" + getCurrentTime() + "] " + message);
    }

    default boolean validateWithLogging(String data) {
        log("Валидация: " + data);
        return validate(data);
    }

    default boolean validateSafely(String data) {
        log("Безопасная валидация");
        try {
            return validate(data);
        } catch (Exception e) {
            log("Ошибка: " + e.getMessage());
            return false;
        }
    }
}
