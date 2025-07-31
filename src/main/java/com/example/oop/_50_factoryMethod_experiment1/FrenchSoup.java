package com.example.oop._50_factoryMethod_experiment1;

public class FrenchSoup implements Dish {
    private String dishName = "французский-суп";

    @Override
    public void prepare() {
        System.out.println("Подготавливают овощи для " + dishName);
    }

    @Override
    public void cook() {
        System.out.println("Готовят " + dishName + " по французской рецептуре");
    }

    @Override
    public void serve() {
        System.out.println("Подают " + dishName + " с багетом");
    }

    @Override
    public String getDishName() {
        return dishName;
    }
}
