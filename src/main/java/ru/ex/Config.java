package ru.ex;

public class Config {
    public static void load(String path) {
        if (path != null) {
            System.out.println("load config by " + path);
        } else {
            throw new IllegalStateException("Path could not be null.");
        }
    }

    public static void main(String[] args) {
        load("jdbc://localhost:8080");
    }
}
