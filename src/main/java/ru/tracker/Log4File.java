package ru.tracker;

public class Log4File {
    private String[] messages = new String[1000];
    private int index = 0;

    public void add(String message) {
        messages[index++] = message;
    }

    public void save() {
    }
}
