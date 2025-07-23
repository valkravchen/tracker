package com.example.oop.abstraction_35.experiment2;

public class PostgreSQL extends Database {
    public PostgreSQL(String url) {
        super(url);
    }

    @Override
    public void connect() {
        System.out.println("Подключение к PostgreSQL: " + connectionUrl + ", макс.соединений: " +
                getMaxConnections());
    }

    public static void main(String[] args) {
        WebApp webApp = new WebApp();
        webApp.printConfig("port");
        System.out.println("Формат по умолчанию: " + Configurable.getDefaultFormat());
        PostgreSQL postgreSQL = new PostgreSQL("localhost:5432");
        postgreSQL.connect();
        postgreSQL.disconnect();
    }
}
