package com.example.oop.inheritanceVSabstractClass;

public interface Movable {
    public abstract String move();

    public default String accelerate() {
        return "Объект ускоряется по умолчанию";
    }
}
