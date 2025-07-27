package com.example.oop._51_enum_experiment2;

public enum PaymentMethod implements Processable {
    НАЛИЧНЫЕ("наличный расчет") {
        @Override
        public void processPayment(double amount) {
            System.out.println("Обработка наличной оплаты суммы " + amount + " " +
                    " через " + НАЛИЧНЫЕ.methodName);
        }

        @Override
        public String process() {
            return "Интерфейсная обработка: " + НАЛИЧНЫЕ.methodName;
        }
    },

    КАРТА("карточная оплата") {
        @Override
        public void processPayment(double amount) {
            System.out.println("Обработка карточной оплаты суммы " + amount + " " +
                    " через " + КАРТА.methodName);
        }

        @Override
        public String process() {
            return "Интерфейсная обработка: " + КАРТА.methodName;
        }
    },

    ЭЛЕКТРОННЫЙ("электронная оплата") {
        @Override
        public void processPayment(double amount) {
            System.out.println("Обработка электронной оплаты " + amount + " " +
                    " через " + ЭЛЕКТРОННЫЙ.methodName);
        }

        @Override
        public String process() {
            return "Интерфейсная обработка: " + ЭЛЕКТРОННЫЙ.methodName;
        }
    };

    private final String methodName;

    PaymentMethod(String methodName) {
        this.methodName = methodName;
    }

    abstract void processPayment(double amount);

    String getUrgencyLevel() {
        return switch (this) {
            case НАЛИЧНЫЕ -> "немедленная обработка";
            case КАРТА -> "быстрая обработка";
            case ЭЛЕКТРОННЫЙ -> "отложенная обработка";
        };
    }

    void showMethodInfo() {
        System.out.println("Способ оплаты: " + methodName);
    }
}

