package com.example.oop._50_factoryMethod_experiment1;

public class JapaneseRestaurant extends Restaurant {
    public JapaneseRestaurant() {
        super("японская-кухня");
    }

    @Override
    public Dish createSignatureDish() {
        System.out.println("Японский фабричный-метод создает фирменное блюдо");
        return new JapaneseSushi();
    }
}
