package com.example.oop._50_factoryMethod_experiment1;

public abstract class Restaurant {
    private String restaurantType;

    protected Restaurant(String restaurantType) {
        this.restaurantType = restaurantType;
    }

    public abstract Dish createSignatureDish();

    public void serveCustomer(String customerName) {
        System.out.println("Фабричный-ресторан " + restaurantType +
                " обслуживает клиента: " + customerName);

        Dish dish = createSignatureDish();
        dish.prepare();
        dish.cook();
        dish.serve();

        System.out.println("Клиент " + customerName + " получил блюдо: " +
                dish.getDishName());
        System.out.println("---");
    }
    public void showRestaurantInfo() {
        System.out.println("Ресторан специализации: " + restaurantType);
    }
}
