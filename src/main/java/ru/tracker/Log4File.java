package ru.tracker;

public final class Log4File {
    private String[] messages = new String[1000];
    private int index = 0;

    private Log4File() {
    }

    public void add(String message) {
        messages[index++] = message;
    }

    public void save() {
    }
}
