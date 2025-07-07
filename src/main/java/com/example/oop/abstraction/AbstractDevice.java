package com.example.oop.abstraction;

public abstract class AbstractDevice {
    private String name;
    private int version;

    public AbstractDevice(String name, int version) {
        this.name = validateName(name);
        this.version = validateVersion(version);
    }

    private String validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть null или пустой строкой");
        }
        return name;
    }

    public abstract String start();

    public abstract String stop();

    public String getStatus() {
        return "Устройство: " + name + "; версия: " + version;
    }

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version;
    }

    private int validateVersion(int version) {
        if (version < 1) {
            throw new IllegalArgumentException("Версия не может быть меньше 1");
        }
        return version;
    }
}
