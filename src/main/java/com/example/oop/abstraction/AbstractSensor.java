package com.example.oop.abstraction;

public abstract class AbstractSensor {
    private String id;
    private int sensitivity;

    public AbstractSensor(String id, int sensitivity) {
        this.id = validateId(id);
        this.sensitivity = validateSensitivity(sensitivity);
    }

    public String getId() {
        return id;
    }

    public int getSensitivity() {
        return sensitivity;
    }

    public abstract String activate();

    public abstract String deactivate();

    protected abstract boolean isActive();

    public String getStatus() {
        return "Сенсор: " + id + ", чувствительность: " + sensitivity +
                ", состояние: " + (isActive() ? "активен" : "неактивен");
    }

    public String reset() {
        deactivate();
        return "Сенсор " + id + " сброшен в неактивное состояние";
    }

    private String validateId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Идентификатор не может быть null или пустой строкой");
        }
        return id;
    }

    private int validateSensitivity(int sensitivity) {
        if (sensitivity < 1 || sensitivity > 100) {
            throw new IllegalArgumentException("Чувствительность должна быть от 1 до 100");
        }
        return sensitivity;
    }
}

