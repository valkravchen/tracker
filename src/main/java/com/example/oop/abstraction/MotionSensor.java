package com.example.oop.abstraction;

public class MotionSensor extends AbstractSensor {
    private boolean isDetecting;

    private int batteryLevel;

    public MotionSensor(String id, int sensitivity, int batteryLevel) {
        super(id, sensitivity);
        this.batteryLevel = validateBatteryLevel(batteryLevel);
        this.isDetecting = false;
    }

    public boolean getIsDetecting() {
        return isDetecting;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public String activate() {
        if (batteryLevel == 0) {
            return "Сенсор движения " + getId() + " не может быть активирован: батарея разряжена";
        }
        isDetecting = true;
        return "Сенсор движения " + getId() + " активирован, батарея: " + batteryLevel + "%";
    }

    @Override
    public String deactivate() {
        isDetecting = false;
        return "Сенсор движения " + getId() + " деактивирован, батарея: " + batteryLevel + "%";
    }

    @Override
    protected boolean isActive() {
        return isDetecting;
    }

    public String detect() {
        if (isDetecting && batteryLevel > 0) {
            return "Сенсор движения " + getId() + " фиксирует движение";
        } else {
            return "Сенсор движения " + getId() + " неактивен или батарея разряжена";
        }
    }

    public String recharge(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Количество заряда не может быть отрицательным");
        }
        batteryLevel = Math.min(batteryLevel + amount, 100);
        return "Сенсор движения id " + getId() + " заряжен до " + batteryLevel + "%";
    }

    private int validateBatteryLevel(int batteryLevel) {
        if (batteryLevel < 0 || batteryLevel > 100) {
            throw new IllegalArgumentException("Уровень батареи должен быть от 0 до 100");
        }
        return batteryLevel;
    }
}
