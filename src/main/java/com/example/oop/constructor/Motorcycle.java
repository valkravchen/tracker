package com.example.oop.constructor;

public class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(String brand, String type) {
        super(brand);
        this.type = validateType(type) ? type : "Некорректный ввод типа";
    }

    public Motorcycle(String type) {
        this("Неизвестный", type);
    }

    private boolean validateType(String type) {
        return type != null && !type.trim().isEmpty();
    }

    public String getInfo() {
        return "Мотоцикл: " + super.getInfo().substring(11) + "; " + type;
    }
}
