package ru.cast;

public class Main {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle car = new Car();
        Vehicle[] vehicles = new Vehicle[]{plane, train, car};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
