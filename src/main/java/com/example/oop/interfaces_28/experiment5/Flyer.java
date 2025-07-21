package com.example.oop.interfaces_28.experiment5;

public interface Flyer {
    default String move() {
        return "Летит по воздуху";
    }
}
