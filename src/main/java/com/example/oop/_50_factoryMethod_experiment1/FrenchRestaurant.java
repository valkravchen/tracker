package com.example.oop._50_factoryMethod_experiment1;

public class FrenchRestaurant extends Restaurant {
    public FrenchRestaurant() {
        super("французская-кухня");
    }

    @Override
    public Dish createSignatureDish() {
        System.out.println("Французский фабричный-метод создает фирменное блюдо");
        return new FrenchSoup();
    }
}
