package com.example.oop._52_record_experiment1;

import java.util.HashSet;
import java.util.Set;

public class ProductManager {
    void demonstrateRecordBenefits() {
        ProductInfo product1 = new ProductInfo("iPhone 15", 80000.0,
                "Электроника");

        ProductInfo product2 = new ProductInfo("iPhone 15",
                80000.0, "Электроника");

        System.out.println("Первый продукт: " + product1);
        System.out.println("Автоматический toString: " + product1.toString());
        System.out.println("Геттеры без префикса get:");
        System.out.println(" Название: " + product1.productName());
        System.out.println(" Цена: " + product1.productPrice());
        System.out.println(" Категория: " + product1.productCategory());
        System.out.println("Автоматический equals: " + product1.equals(product2));
        System.out.println("Одинаковый hashCode: " + (product1.hashCode() == product2.hashCode()));
    }

    void demonstrateCollectionUsage() {
        Set<ProductInfo> products = new HashSet<>();
        products.add(new ProductInfo("MacBook Pro", 150000.0, "Компьютеры"));
        products.add(new ProductInfo("MacBook Pro", 150000.0, "Компьютеры"));
        products.add(new ProductInfo("iPad", 45000.0, "Планшеты"));
        System.out.println("Использование в коллекциях (Set):");
        System.out.println("Добавили 3 продукта, в Set попало: " + products.size() +
                " (дубликат автоматически исключен)");
        for (ProductInfo product: products) {
            System.out.println(" - " + product);
        }
    }

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        manager.demonstrateRecordBenefits();
        manager.demonstrateCollectionUsage();
    }
}
