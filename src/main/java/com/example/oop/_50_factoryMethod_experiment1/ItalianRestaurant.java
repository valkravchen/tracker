package com.example.oop._50_factoryMethod_experiment1;

public class ItalianRestaurant extends Restaurant {
    public ItalianRestaurant() {
        super("итальянская-кухня");
    }

    @Override
    public Dish createSignatureDish() {
        System.out.println("Итальянский фабричный-метод создает фирменное блюдо");
        return new ItalianPasta();
    }
}
