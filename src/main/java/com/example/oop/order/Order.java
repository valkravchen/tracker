package com.example.oop.order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<String> items;
    private double totalPrice;
    private static int nextOrderId;

    static {
        nextOrderId = 1000;
        System.out.println("Система заказов запущена!");
    }

    {
        orderId = nextOrderId++;
        System.out.println("Создан заказ: " + orderId);
    }

    public Order(List<String> items, double totalPrice) {
        this.items = validateItems(items) ? items : new ArrayList<>();
        this.totalPrice = validatePrice(totalPrice) ? totalPrice : 0.0;
    }

    public Order(List<String> items) {
        this(items, 0.0);
    }

    public Order() {
        this(new ArrayList<>(), 0.0);
    }

    public void addItem(String item) {
        items.add(item);
        totalPrice += 10;
    }

    public String getOrderInfo() {
        return "Заказ " + orderId + " товары: " + items + ", сумма: " + totalPrice;
    }

    private boolean validateItems(List<String> items) {
        return items != null && !items.isEmpty();
    }

    private boolean validatePrice(double price) {
        return price >= 0;
    }

    public static void main(String[] args) {
        List<String> items1 = new ArrayList<>();
        items1.add("Книга");
        items1.add("Ручка");
        Order order1 = new Order(items1, 30.0);
        order1.addItem("Карандаш");
        List<String> items2 = new ArrayList<>();
        items2.add("Тетрадь");
        Order order2 = new Order(items2);
        Order order3 = new Order();
        System.out.println(order1.getOrderInfo());
        System.out.println(order2.getOrderInfo());
        System.out.println(order3.getOrderInfo());
    }
}
