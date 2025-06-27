package com.example.oop.constructor;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = validateMake(make) ? make : "Некорректно указана марка автомобиля!";
        this.model = validateModel(model) ? model : "Некорректно указана модель автомобиля";
        this.year = validateYear(year) ? year : 2025;
    }

    public Car(String make, String model) {
        this(make, model, 2025);
    }

    public Car() {
        this("Марка неизвестна", "Модель неизвестна", 2025);
    }

    public String getCarInfo() {
        return "Марка автомобиля: " + make +
                "; модель автомобиля: " + model +
                "; год выпуска: " + year;
    }

    private boolean validateMake(String make) {
        return make != null && !make.trim().isEmpty();
    }

    private boolean validateModel(String model) {
        return model != null && !model.trim().isEmpty();
    }

    private boolean validateYear(int year) {
        return year >= 1896 && year <= 2025;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car();
        System.out.println(car1.getCarInfo());
        System.out.println(car2.getCarInfo());
        System.out.println(car3.getCarInfo());
        Car car4 = new Car("", null, 2090);
        System.out.println(car4.getCarInfo());
    }
}
