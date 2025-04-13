package ru.oop_exam;

public class Lego {
    private String shape;

    public Lego(String shape) {
        this.shape = shape;
    }

    void connect() {
        System.out.println(shape + " соединяется");
    }

    void detach() {
        System.out.println(shape + " отсоединяется");
    }
}
