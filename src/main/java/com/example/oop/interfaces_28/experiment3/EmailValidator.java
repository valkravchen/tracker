package com.example.oop.interfaces_28.experiment3;

public class EmailValidator implements Validator {
    @Override
    public boolean validate(String input) {
        return input.contains("@") && input.contains(".");
    }

    public static void main(String[] args) {
        EmailValidator validator = new EmailValidator();
        boolean result1 = validator.validateWithLogging("test@mail.com");
        System.out.println("Валидация с логированием: " + result1);
        System.out.println();
        boolean result2 = validator.validateSafely("invalid-email");
        System.out.println("Безопасная валидация: " + result2);
    }
}
