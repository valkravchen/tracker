package com.example.oop._50_factoryMethod_experiment1;

public class MexicanRestaurant extends Restaurant {
    public MexicanRestaurant() {
        super("мексиканская-кухня");
    }

    @Override
    public Dish createSignatureDish() {
        System.out.println("Мексиканский фабричный-метод создает фирменное блюдо");
        return new MexicanTacos();
    }
}
