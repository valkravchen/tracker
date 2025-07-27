package com.example.oop._51_enum_experiment2;

public class PaymentProcessor {
    void handlePayment(PaymentMethod method, double amount) {
        method.showMethodInfo();
        System.out.println(method.process());
        method.processPayment(amount);
        System.out.println("Срочность: " + method.getUrgencyLevel());
        System.out.println("Платеж завершен");
    }

    void demonstrateAllMethods() {
        System.out.println("Все способы оплаты через values():");
        for (PaymentMethod method : PaymentMethod.values()) {
            System.out.println("Метод " + (method.ordinal() + 1) + ": "
                    + method.process() + " - " + method.getUrgencyLevel());
        }
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.demonstrateAllMethods();
        System.out.println("Детальная обработка платежей:");
        processor.handlePayment(PaymentMethod.КАРТА, 250.75);
        processor.handlePayment(PaymentMethod.ЭЛЕКТРОННЫЙ, 99.99);
    }
}
