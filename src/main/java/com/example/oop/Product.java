package com.example.oop;

public class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price) {
        this("P000", name, price);
    }

    public Product() {
        this("P000", "неизвестно", 10.0);
    }
}
