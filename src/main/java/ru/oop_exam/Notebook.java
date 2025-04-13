package ru.oop_exam;

public class Notebook {
    private String note;

    public Notebook(String note) {
        this.note = note;
    }

    public void showNote() {
        System.out.println("Заметка: " + note);
    }
}
