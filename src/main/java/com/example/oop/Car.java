package com.example.oop;

public class Car implements Vehicle {
    private String model;
    private int speed;
    private static int carCount;

    static {
        carCount = 0;
        System.out.println("Класс Car загружен");
    }

    {
        System.out.println("Создаётся новый объект Car");
    }

    public class Engine {
        private int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
            System.out.println("Двигатель для " + model + " создан");
        }

        public int getPower() {
            return horsepower;
        }
    }

    public Car(String model) {
        this.model = model;
        this.speed = 0;
        carCount++;
    }

    @Override
    public void starEngine() {
        System.out.println("Двигатель автомобиля " + model + " запущен");
    }

    public void accelerate(int increment) {
        if (increment > 0) {
            speed += increment;
        }
    }

    public String getModel() {
        return model;
    }

    public static int getCarCount() {
        return carCount;
    }
}
