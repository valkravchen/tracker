package com.example.oop._50_factoryMethod_experiment1;

public class JapaneseSushi implements Dish {
    private String dishName = "японские-суши";

    @Override
    public void prepare() {
        System.out.println("Подготавливают свежую рыбу для " + dishName);
    }

    @Override
    public void cook() {
        System.out.println("Готовят " + dishName + " по японской традиции");
    }

    @Override
    public void serve() {
        System.out.println("Подают " + dishName + " с васаби и соевым соусом");
    }

    @Override
    public String getDishName() {
        return dishName;
    }
}
