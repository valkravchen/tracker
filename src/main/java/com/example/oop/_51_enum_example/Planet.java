package com.example.oop._51_enum_example;

public enum Planet {
    МЕРКУРИЙ("ближайшая планета", 0.330),
    ВЕНЕРА("вторая платета", 4.87),
    ЗЕМЛЯ("третья планета", 5.97),
    МАРС("красная планета", 0.642);

    private final String description;
    private final double massInTrillionKg;

    Planet(String description, double massInTrillionKg) {
        this.description = description;
        this.massInTrillionKg = massInTrillionKg;
    }

    public boolean isInnerPlanet() {
        return this == МЕРКУРИЙ || this == ВЕНЕРА || this == ЗЕМЛЯ || this == МАРС;
    }
}
