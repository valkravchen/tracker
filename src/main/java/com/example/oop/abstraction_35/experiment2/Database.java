package com.example.oop.abstraction_35.experiment2;

public abstract class Database {
    protected String connectionUrl;
    private int maxConnections = 10;

    public Database(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    abstract void connect();

    public void disconnect() {
        System.out.println("Отключение от " + connectionUrl);
    }

    protected int getMaxConnections() {
        return maxConnections;
    }
}
