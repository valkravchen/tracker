package ru.ooa;

public final class Airbus extends Aircraf {
    private static final int COUNT_ENGINE = 2;

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолёта: " + name);
    }

    public void printCountEngine() {
        int engine = "A380".equals(name) ? 4 : COUNT_ENGINE;
        System.out.println("Количество двигателей равно: " + engine);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}

