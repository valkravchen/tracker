package ru.early;

public class PasswordValidator {
    private static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        char[] chars = password.toCharArray();
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigit = 0;
        int countSpecial = 0;
        for (char symbol : chars) {
            if (Character.isUpperCase(symbol)) {
                countUpperCase += 1;
            } else if (Character.isLowerCase(symbol)) {
                countLowerCase++;
            } else if (Character.isDigit(symbol)) {
                countDigit++;
            } else {
                countSpecial++;
            }
        }
        if (countUpperCase < 1) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (countLowerCase < 1) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (countDigit < 1) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (countSpecial < 1) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        String lowerPassword = password.toLowerCase();
        for (String word : FORBIDDEN) {
            if (lowerPassword.contains(word)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: " +
                        "qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}

