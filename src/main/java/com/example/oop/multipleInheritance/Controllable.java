package com.example.oop.multipleInheritance;

public interface Controllable {
    public abstract String turnOn();

    public default String turnOff() {
        return "Устройство выключено по умолчанию (Controllable)";
    }
}
