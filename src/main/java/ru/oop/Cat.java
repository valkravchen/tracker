package ru.oop;

public class Cat {

    private String food;

    public void show() {
        System.out.println(this.food);
    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        System.out.println("There is gav's food.");
        Cat gav = new Cat();
        gav.show();
        System.out.println("There is black's food.");
        Cat black = new Cat();
        black.show();
    }
}
