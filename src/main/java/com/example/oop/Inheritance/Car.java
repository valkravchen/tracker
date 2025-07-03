package com.example.oop.Inheritance;

public class Car extends Vehicle {
    private String model;
    private String parentStartEngineResult;

    public Car(String brand, int year, String model) {
        super(brand, year);
        this.parentStartEngineResult = super.startEngine();
        this.model = validateModel(model);
    }

    private String validateModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Модель не может быть null или пустой строкой");
        }
        return model;
    }

    @Override
    public String getInfo() {
        return "Автомобиль: " + getBrand() + ", год: " + getYear() + ", модель: " + model;
    }

    @Override
    public String startEngine() {
        return super.startEngine() + ", автомобиль готов";
    }

    public String gerParentInfo() {
        return super.getInfo();
    }

    public String getParentStartEngineResult() {
        return parentStartEngineResult;
    }

    public static void main(String[] args) {
        try {
            Vehicle vehicle = new Vehicle("Toyota", 2020);
            System.out.println("Vehicle:");
            System.out.println("getInfo: " + vehicle.getInfo());
            System.out.println("startEngine: " + vehicle.startEngine());
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println();
        }
        try {
            Car car1 = new Car("Honda", 2018, "Civic");
            System.out.println("Car1:");
            System.out.println("getInfo: " + car1.getInfo());
            System.out.println("startEngine: " + car1.startEngine());
            System.out.println("getParentInfo: " + car1.gerParentInfo());
            System.out.println("super.startEngine from constructor: " + car1.getParentStartEngineResult());
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println();
        }
        try {
            Car car2 = new Car(null, 1800, "");
            System.out.println("Car2:");
            System.out.println("getInfo: " + car2.getInfo());
            System.out.println("startEngine: " + car2.startEngine());
            System.out.println("getParentInfo: " + car2.gerParentInfo());
            System.out.println("super.startEngine from constructor: " + car2.getParentStartEngineResult());

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println();
        }
    }
}
