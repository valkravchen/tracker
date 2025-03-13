package ru.poly;

public class Bus implements Transport {
    private int passengersCount;
    private final double pricePerUnitOfFuel;

    public Bus(double pricePerUnitOfFuel) {
        this.pricePerUnitOfFuel = pricePerUnitOfFuel;
    }

    @Override
    public void drive() {
        System.out.println("Автобус едет по маршруту.");
    }

    @Override
    public void passengers(int count) {
        if (count >= 0) {
            System.out.println("В автобусе " + count + " пассажиров.");
        } else {
            System.out.println("Некорректное количество пассажиров.");
        }
    }

    @Override
    public double refuel(double amount) {
        if (amount > 0) {
            return amount * pricePerUnitOfFuel;
        } else {
            return 0;
        }
    }
}
