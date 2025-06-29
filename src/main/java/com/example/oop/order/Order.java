package com.example.oop.order;

public class Order {
    private String orderId;
    private String description;
    private double total;
    private static int nextOrderId;

    public String getOrderId() {
        return orderId;
    }

    static {
        nextOrderId = 100;
    }

    {
        orderId = "ORD: " + nextOrderId++;
    }

    public Order(String description, double total) {
        this.description = validateDescription(description) ? description : "пусто";
        this.total = validateTotal(total) ? total : 0.0;
    }

    public Order(String description) {
        this(description, 0.0);
    }

    public Order() {
        this("пусто", 0.0);
    }

    private boolean validateDescription(String description) {
        return description != null && !description.trim().isEmpty();
    }

    private boolean validateTotal(double total) {
        return total >= 0.0;
    }

    public String getOrderInfo() {
        return "Заказ: № " + orderId + "; " +
                "описание заказа: " + description + "; " +
                "сумма заказа: " + total;
    }

    public void updateTotal(double newTotal) {
        this.total = validateTotal(newTotal) ? newTotal : 0.0;
    }

    public static void main(String[] args) {
        Order order1 = new Order("Книги", 50.0);
        Order order2 = new Order("Ноутбук");
        Order order3 = new Order();
        order1.updateTotal(75.0);
        System.out.println(order1.getOrderInfo());
        System.out.println(order2.getOrderInfo());
        System.out.println(order3.getOrderInfo());
    }
}
