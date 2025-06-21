package com.com.example;

public class ShoppingCart {
    public static class CartItem {
        private String name;
        private double price;

        public CartItem(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getItemInfo() {
            return name + " " + price + " - рублей";
        }
    }

    void demoCart() {
        CartItem item1 = new CartItem("Книга", 3333.33);
        CartItem item2 = new CartItem("Ноутбук", 99999.99);

        System.out.println("Товары в карзине");
        System.out.println("1. " + item1.getItemInfo());
        System.out.println("2. " + item2.getItemInfo());
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.demoCart();
    }
}
