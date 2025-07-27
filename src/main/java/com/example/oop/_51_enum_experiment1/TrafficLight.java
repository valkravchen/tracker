package com.example.oop._51_enum_experiment1;

public enum TrafficLight {
    КРАСНЫЙ("стоп-сигнал", 30),
    ЖЕЛТЫЙ("внимание-сигнал", 5),
    ЗЕЛЕНЫЙ("движение-разрешено", 25);

    private final String description;
    private final int durationSeconds;

    private TrafficLight(String description, int durationSeconds) {
        this.description = description;
        this.durationSeconds = durationSeconds;
    }

    public String getDescription() {
        return description;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public TrafficLight getNext() {
        return switch (this) {
            case КРАСНЫЙ -> ЗЕЛЕНЫЙ;
            case ЖЕЛТЫЙ -> КРАСНЫЙ;
            case ЗЕЛЕНЫЙ -> ЖЕЛТЫЙ;
        };
    }

    public void showInfo() {
        System.out.println("Сигнал светофора: " + description + ", длительность: "
                + durationSeconds + " сек");
    }
}
