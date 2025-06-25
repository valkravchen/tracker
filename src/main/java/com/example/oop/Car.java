package com.example.oop;

public class Car {
    private String model;
    private static int totalCars;

    static {
        System.out.println("Фабрика машин запущена!");
    }

    {
        totalCars++;
        System.out.println("Количество созданных объектов: " + totalCars);
    }

    public Car(String model) {
        this.model = checkModel(model) ? model : "Некорректная модель!";
    }

    public Car() {
        this.model = "Безымянная машина";
    }

    private boolean checkModel(String model) {
        return model != null && !model.isEmpty();
    }

    public void drive() {
        System.out.println("Едет " + model);
    }

    public static int getTotalCars() {
        return totalCars;
    }

    public static class Engine {
        private int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        public void start() {
            System.out.println("Двигатель запущен, мощность: " + horsepower + " л.с.");
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Бибика");
        car1.drive();
        car2.drive();
        Engine engine = new Engine(333);
        engine.start();
        System.out.println(getTotalCars());
    }
}
