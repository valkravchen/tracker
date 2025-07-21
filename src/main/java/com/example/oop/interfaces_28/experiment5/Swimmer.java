package com.example.oop.interfaces_28.experiment5;

public interface Swimmer {
    default String move() {
        return "Плывет по воде";
    }
}
