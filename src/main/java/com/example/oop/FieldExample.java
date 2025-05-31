package com.example.oop;

public class FieldExample {
    public static String CLASS_NAME = "FieldExample";
    private int instanceValue;

    public FieldExample(int instanceValue) {
        this.instanceValue = instanceValue;
    }

    public void displayInfo() {
        System.out.println("instanceValue: " + instanceValue + ", CLASS_NAME: " + CLASS_NAME);
    }
}
