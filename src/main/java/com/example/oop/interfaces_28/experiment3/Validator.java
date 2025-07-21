package com.example.oop.interfaces_28.experiment3;

public interface Validator {
    boolean validate(String input);

    private String getCurrentTime() {
        return java.time.LocalTime.now().toString();
    }

    private void log(String message) {
        System.out.println("[" + getCurrentTime() + "] " + message);
    }

    default boolean validateWithLogging(String input) {
        log("Начало валидации: " + input);
        boolean result = validate(input);
        log("Результат валидации: " + result);
        return result;
    }

    default boolean validateSafely(String input) {
        log("Безопасная валидация");
        try {
            return validate(input);
        } catch (Exception e) {
            log("Ошибка валидации: " + e.getMessage());
            return false;
        }
    }
}
