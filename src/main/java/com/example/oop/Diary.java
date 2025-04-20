package com.example.oop;

public class Diary {
    private String entry;

    public Diary(String entry) {
        this.entry = entry;
    }

    public void readEntry() {
        System.out.println("Запись: " + entry);
    }
}

