package com.example.oop;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car("Волга", 1989);
        FieldExample fieldExample = new FieldExample(3);
        car.displayInfo();
        fieldExample.displayInfo();
    }
}
