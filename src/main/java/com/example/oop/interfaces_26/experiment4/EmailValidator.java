package com.example.oop.interfaces_26.experiment4;

public class EmailValidator implements com.example.oop.interfaces_26.experiment4.DataValidator {
    @Override
    public boolean validate(String data) {
        return data.contains("@");
    }

    public static void main(String[] args) {
        EmailValidator email = new EmailValidator();
        boolean result1 = email.validateWithLogging("test@example.com");
        System.out.println("Email валиден: " + result1);
        boolean result2 = email.validateSafely(null);
        System.out.println("Email безопасно: " + result2);
    }
}

