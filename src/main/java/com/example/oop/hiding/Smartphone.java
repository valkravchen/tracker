package com.example.oop.hiding;

public class Smartphone extends Gadget {
    private String model;

    public Smartphone(String brand, int year, String model) {
        super(brand, year);
        this.model = validateModel(model);
    }

    private String validateModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Модель не может быть null или пустой строкой");
        }
        return model;
    }

    public static String getCategory() {
        return "Смартфон";
    }

    @Override
    public String getInfo() {
        return "Смартфон: " + model + ", марка: " + getBrand() + ", год: " + getYear();
    }

    public String getParentCategory() {
        return Gadget.getCategory();
    }

    public String trySuperCategory() {
        return super.getCategory() + " недоступно для статических методов";
    }

    public String getModel() {
        return model;
    }

    public static void main(String[] args) {
        Gadget gadget = new Gadget("Nokia", 2000);
        Smartphone smartphone = new Smartphone("Apple", 2020, "iPhone");
        Gadget smart = new Smartphone("Samsung", 2021, "Galaxy");
        System.out.println(Gadget.getCategory());
        System.out.println(gadget.getCategory());
        System.out.println(gadget.getInfo());
        System.out.println();
        System.out.println(Smartphone.getCategory());
        System.out.println(smartphone.getCategory());
        System.out.println(smartphone.getInfo());
        System.out.println(smartphone.getParentCategory());
        System.out.println(smartphone.trySuperCategory());
        System.out.println();
    }
}

