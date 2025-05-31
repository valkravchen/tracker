package com.example.oop;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car("Волга", 1989);
        FieldExample fieldExample = new FieldExample(3);
        Person person = new Person("Александр", 33);
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        car.displayInfo();
        fieldExample.displayInfo();
        person.displayInfo();
        counter2.displayInfo();
    }
}
