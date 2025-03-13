package ru.poly;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(100);
        bus.passengers(3);
        double cost = bus.refuel(30);
        bus.drive();
        System.out.println(cost);
    }
}
