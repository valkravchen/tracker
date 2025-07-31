package com.example.oop._50_factoryMethod_experiment1;

public class ItalianPasta implements Dish {
    private String dishName = "итальянская-паста";

    @Override
    public void prepare() {
        System.out.println("Подготавливают ингредиенты для " + dishName);
    }

    @Override
    public void cook() {
        System.out.println("Готовят " + dishName + " по итальянской технологии");
    }

    @Override
    public void serve() {
        System.out.println("Подают " + dishName + " с пармезаном");
    }

    @Override
    public String getDishName() {
        return dishName;
    }
}
