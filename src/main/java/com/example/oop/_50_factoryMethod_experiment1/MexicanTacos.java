package com.example.oop._50_factoryMethod_experiment1;

public class MexicanTacos implements Dish {
    String dishName = "мексиканские-такос";

    @Override
    public void prepare() {
        System.out.println("Подготавливают мясо и овощи для " + dishName);
    }

    @Override
    public void cook() {
        System.out.println("Готовят " + dishName + " на гриле");
    }

    @Override
    public void serve() {
        System.out.println("Подают " + dishName + " с острым соусом");
    }

    @Override
    public String getDishName() {
        return dishName;
    }
}
