package com.example.oop.abstraction;

public class Smartphone extends  AbstractDevice {
    private boolean isActive;

    public Smartphone(String name, int version) {
        super(name, version);
        this.isActive = false;
    }

    @Override
    public String start() {
        isActive = true;
        return "Смартфон " + getName() + "; версии " + getVersion() + "; запущен";
    }

    @Override
    public String stop() {
        isActive = false;
        return "Смартфон " + getName() + "; версии " + getVersion() + "; остановлен";
    }

    public String toggle() {
        if (isActive) {
            return "Смартфон " + getName() + "; версии " + getVersion() + "; теперь работает";
        } else {
            return "Смартфон " + getName() + "; версии " + getVersion() + "; теперь остановлен";
        }
    }

    public boolean isActive() {
        return isActive;
    }
}
