package com.example.oop.encapsulation;

public class FlexibleClass {
    private String data;
    private int value;

    public FlexibleClass() {
        this("Значение по умолчанию", 0);
    }

    protected FlexibleClass(String data) {
        this(data, 42);
    }

    FlexibleClass(int value) {
        this("Число: " + value, value);
    }

    private FlexibleClass(String data, int value) {
        this.data = data;
        this.value = value;
    }

    public static FlexibleClass createCustom(String data, int value) {
        if (data == null) {
            throw new IllegalArgumentException("Data не может быть null");
        }
        return new FlexibleClass(data, value);
    }

    public String getData() {
        return data;
    }

    public int getValue() {
        return value;
    }
}
