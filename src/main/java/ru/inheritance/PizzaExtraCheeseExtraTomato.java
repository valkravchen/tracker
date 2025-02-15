package ru.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    public String name() {
        return super.name() + " and tomato";
    }
}
