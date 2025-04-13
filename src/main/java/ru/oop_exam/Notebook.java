package ru.oop_exam;

public class Notebook {
    private String note;

    public Notebook(String note) {
        this.note = note;
    }

    void addNote() {
        System.out.println("Добавлена новая заметка: " + note);
    }

    public String getNote() {
        return note;
    }
}
