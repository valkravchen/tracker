package com.example.oop.abstraction;

public class TemperatureSensor extends AbstractSensor {
    private boolean isActive;

    public TemperatureSensor(String id, int sensitivity) {
        super(id, sensitivity);
        this.isActive = false;
    }

    public boolean getIsActive() {
        return isActive;
    }

    @Override
    public String activate() {
        isActive = true;
        return "Температурный сенсор " + getId() + " активирован";
    }

    @Override
    public String deactivate() {
        isActive = false;
        return "Температурный сенсор " + getId() + " деактивирован";
    }

    @Override
    protected boolean isActive() {
        return isActive;
    }

    public String measure() {
        if (isActive) {
            return "Температурный сенсор " + getId() + " измеряет температуру";
        } else {
            return "Температурный сенсор " + getId() + " неактивен, измерение невозможно";
        }
    }

    public static void main(String[] args) {
        MotionSensor motionSensor = new MotionSensor("Motion001", 60, 80);
        System.out.println(motionSensor.activate());
        System.out.println(motionSensor.getStatus());
        System.out.println(motionSensor.detect());
        System.out.println(motionSensor.recharge(15));
        System.out.println(motionSensor.getStatus());
        System.out.println(motionSensor.reset());
        System.out.println(motionSensor.getStatus());
    }
}
