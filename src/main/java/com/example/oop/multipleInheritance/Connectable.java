package com.example.oop.multipleInheritance;

public interface Connectable {
    public abstract String connect();

    public default String turnOff() {
        return "Устройство отключено от сети (Connectable)";
    }
}
