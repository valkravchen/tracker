package com.example.oop;

public class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = (productId != null && !productId.trim().isEmpty() ? productId : "P000");
        this.name = validateName(name) ? name : "некорректное название";
        this.price = validatePrice(price) ? price : 10.0;
    }

    public Product(String name, double price) {
        this("P000", name, price);
    }

    public Product() {
        this("P000", "неизвестно", 10.0);
    }

    private boolean validateName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    private boolean validatePrice(double price) {
        return price >= 0;
    }

    public String getProductInfo() {
        return "Характеристика товара: № " + productId +
                "; наименование товара: " + name +
                "; цена товара: " + price;
    }
}
