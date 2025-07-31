package com.example.oop._50_factoryMethod_experiment1;

public class Main {
    public static void main(String[] args) {
        Restaurant[] restaurants = {
                new ItalianRestaurant(),
                new JapaneseRestaurant(),
                new FrenchRestaurant()
        };

        System.out.println("Демонстрация паттерна Factory-Method в ресторанной сети:");

        for (Restaurant restaurant : restaurants) {
            restaurant.showRestaurantInfo();
        }

        for (int i = 0; i < restaurants.length; i++) {
            restaurants[i].serveCustomer("клиент-" + (i + 1));
        }
        System.out.println("Расширение системы новым рестораном:");
        MexicanRestaurant mexicanRestaurant = new MexicanRestaurant();
        mexicanRestaurant.showRestaurantInfo();
        mexicanRestaurant.serveCustomer("любитель-острого");
        System.out.println("Новый ресторан добавлен без изменения существующего кода!");
    }
}
