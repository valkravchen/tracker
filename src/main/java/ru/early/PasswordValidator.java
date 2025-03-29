package ru.early;

public class PasswordValidator {
    private static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};
    private static final String SPECIAL_CHARS = "!@#$%^&*()_+-=[]{}|;:'\",.<>/?";

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        String lowerPassword = password.toLowerCase();
        for (String word : FORBIDDEN) {
            if (lowerPassword.contains(word)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: " +
                        "qwerty, 12345, password, admin, user");
            }
        }
        char[] chars = password.toCharArray();
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isDigit = false;
        boolean isSpecial = false;
        for (char symbol : chars) {
            if (!isUpperCase && Character.isUpperCase(symbol)) {
                isUpperCase = true;
            }
            if (!isLowerCase && Character.isLowerCase(symbol)) {
                isLowerCase = true;
            }
            if (!isDigit && Character.isDigit(symbol)) {
                isDigit = true;
            }
            if (!isSpecial && SPECIAL_CHARS.indexOf(symbol) != -1) {
                isSpecial = true;
            }
            if (isUpperCase && isLowerCase && isDigit && isSpecial) {
                break;
            }
        }
        if (!isUpperCase) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!isLowerCase) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!isDigit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!isSpecial) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        return password;
    }
}


