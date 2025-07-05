package com.example.oop.polymorphism;

public class Car extends Vehicle {
    private String model;

    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = validateModel(model);
    }

    @Override
    public String move() {
        return "Автомобиль движется: " + model;
    }

    public static String getType() {
        return "Автомобиль";
    }

    public String getParentMove() {
        return super.move();
    }

    public String tryOverrideFinale() {
        return "Невозможно переопределить final метод getDescription()";
    }

    public String getModel() {
        return model;
    }

    private String validateModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Модель не может быть null или пустой строкой");
        }
        return model;
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", 2020);
        Car car = new Car("Honda", 2021, "Civic");
        Vehicle vehicleCar = new Car("Ford", 2022, "Mustang");
        Vehicle[] vehicles = {
                new Vehicle("Toyota", 2020),
                new Car("Honda", 2021, "Civic"),
                new Car("Ford", 2022, "Mustang")
        };
        System.out.println(Vehicle.getType());
        System.out.println(vehicle.getType());
        System.out.println(vehicle.move());
        System.out.println(vehicle.getDescription());
        System.out.println();
        System.out.println(Car.getType());
        System.out.println(car.getType());
        System.out.println(car.move());
        System.out.println(car.getDescription());
        System.out.println(car.getParentMove());
        System.out.println(car.tryOverrideFinale());
        System.out.println();
        System.out.println(vehicleCar.getType());
        System.out.println(vehicleCar.move());
        System.out.println(vehicleCar.getDescription());
        System.out.println();
        for (Vehicle v : vehicles) {
            System.out.println(v.move());
        }
    }
}
