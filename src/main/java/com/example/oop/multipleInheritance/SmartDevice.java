package com.example.oop.multipleInheritance;

public class SmartDevice implements Controllable, Connectable {
    private String name;
    private int version;

    public SmartDevice(String name, int version) {
        this.name = validateName(name);
        this.version = validateVersion(version);
    }

    private String validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть null или пустой строкой");
        }
        return name;
    }

    private int validateVersion(int version) {
        if (version < 1) {
            throw new IllegalArgumentException("Версия не может быть меньше 1");
        }
        return version;
    }

    @Override
    public String turnOn() {
        return "Устройство " + name + " версии " + version + " включено";
    }

    @Override
    public String connect() {
        return name + " версии " + version + " подключено к сети";
    }

    @Override
    public String turnOff() {
        return name + " версии " + version + " полностью выключено";
    }

    public String resolveTurnOffControllable() {
        return Controllable.super.turnOff();
    }

    public String resolveTurnOffConnectable() {
        return Connectable.super.turnOff();
    }

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version;
    }
}
