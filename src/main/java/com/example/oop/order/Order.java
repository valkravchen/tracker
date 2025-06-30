package com.example.oop.order;

public class Order {
    private String orderId;
    private double totalPrice;

    public Order(String orderId, double totalPrice) {
        this.orderId = validateOrderId(orderId) ? orderId : "ORD000";
        this.totalPrice = validateTotalPrice(totalPrice) ? totalPrice : 0.0;
    }

    private boolean validateOrderId(String orderId) {
        return orderId != null && !orderId.trim().isEmpty();
    }

    private boolean validateTotalPrice(double price) {
        return price >= 0;
    }

    public String getOrderSummary() {
        return "Заказ № " + orderId + "; сумма = " + totalPrice;
    }

    public void updatePrice(double newPrice) {
        if (validateTotalPrice(newPrice)) {
            totalPrice = newPrice;
        }
    }

    public static void main(String[] args) {
        Order order1 = new Order("ORD001", 100.0);
        Order order2 = new Order("ORD002", 50.0);
        order2.updatePrice(-10);
        System.out.println(order1.getOrderSummary());
        System.out.println(order2.getOrderSummary());
    }
}
