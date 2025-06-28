package com.example.oop.order;

public class Order {
    private String orderId;
    private String description;
    private double total;
    private static int nextOrderId;

    static {
        nextOrderId = 100;
    }

    {
        orderId = "ORD: " + nextOrderId++;
    }

    public Order(String description, double total) {
        this.description = validateDescription(description) ? description : "Некорректное описание";
        this.total = validateTotal(total) ? total : 0.0;
    }

    public Order(String description) {
        this(description, 0.0);
    }

    public Order() {
        this("Пусто", 0.0);
    }

    private boolean validateDescription(String description) {
        return description != null && !description.trim().isEmpty();
    }

    private boolean validateTotal(double total) {
        return total >= 0.0;
    }
}
