package ru.enumeration;

public enum Status {
    ACCEPTED("Приянят"),
    IN_WORK("В работе"),
    WAITING("Ожидание"),
    FINISHED("Работы завершены");

    private String info;

    Status(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
