package com.example.oop.Singleton;

public class Database {
    private static Database instance;

    private Database() {
        System.out.println("Создано подключение к базе данных");
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Выполнен запрос: " + sql);
    }

    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        db1.query("SELECT * FROM users");

        Database db2 = Database.getInstance();
        System.out.println("db1 и db2 это один объект? " + (db1 == db2));
    }
}
