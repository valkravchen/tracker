package com.example.oop.nestedClasses;

public class Car {
    private final String model;

    public Car(String model) {
        this.model = model;
    }

    public static class Engine {
        private final int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        public String describe() {
            return "Двигатель с " + horsePower + " л.с.";
        }
    }

    public static void main(String[] args) {
        Car.Engine car1 = new Engine(100);
        Engine car2 = new Engine(200);
        Engine car3 = new Engine(300);
        System.out.println(car1.describe());
        System.out.println(car2.describe());
        System.out.println(car3.describe());
    }
}
