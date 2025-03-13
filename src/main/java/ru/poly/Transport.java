package ru.poly;

public interface Transport {
    void drive();

    void passengers(int count);

    double refuel(double amount);
}
