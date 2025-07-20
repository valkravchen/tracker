package com.example.oop.interfaces_28.experiment1;

public interface Formatter {
    String format(String text);

    default String formatWithBrackets(String text) {
        return "[" + format(text) + "]";
    }

    default String formatMultiple(String... texts) {
        StringBuilder sb = new StringBuilder();
        for (String text : texts) {
            sb.append(format(text)).append(" ");
        }
        return sb.toString().trim();
    }
}
