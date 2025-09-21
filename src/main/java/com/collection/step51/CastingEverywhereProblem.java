package com.collection.step51;

import java.util.*;

public class CastingEverywhereProblem {
    private List products;
    private Map pricesByCode;
    private Set categories;
    private int totalCasts = 0;

    static class Product {
        String code;
        String name;
        double price;

        Product(String code, String name, double price) {
            this.code = code;
            this.name = name;
            this.price = price;
        }
    }

    static class Category {
        String name;
        List products;

        Category(String name) {
            this.name = name;
            this.products = new ArrayList<>();
        }
    }

    public CastingEverywhereProblem() {
        products = new ArrayList<>();
        pricesByCode = new HashMap<>();
        categories = new HashSet<>();
    }

    public void demonstrateCastingHell() {
        System.out.println("=== ДЕМОНСТРАЦИЯ ПРИВЕДЕНИЙ ТИПОВ ===\n");
        products.add(new Product("A001", "Ноутбук", 50000));
        products.add(new Product("A002", "Мышь", 1000));
        products.add(new Product("A003", "Клавиатура", 3000));
        System.out.println("ОБРАБОТКА ПРОДУКТОВ:");
        for (int i = 0; i < products.size(); i++) {
            totalCasts++;
            Product product = (Product) products.get(i);
            System.out.println("  " + product.name + " - " + product.price + " руб.");
            totalCasts++;
            pricesByCode.put(product.code, (Double) (product.price));
        }

        System.out.println("\nОБРАБОТКА ЦЕНЫ ИЗ MAP:");
        Iterator it = pricesByCode.entrySet().iterator();
        while (it.hasNext()) {
            totalCasts += 2; // Два приведения в одной операции!
            Map.Entry entry = (Map.Entry) it.next();        // Приведение #2
            String code = (String) entry.getKey();          // Приведение #3
            Double price = (Double) entry.getValue();       // Приведение #4

            System.out.println("  Код " + code + ": " + price);
        }

        // Создание категорий с продуктами
        Category electronics = new Category("Электроника");
        electronics.products.addAll(products);
        categories.add(electronics);

        // Вложенные приведения при обработке
        System.out.println("\nВЛОЖЕННЫЕ ПРИВЕДЕНИЯ:");
        Iterator catIt = categories.iterator();
        while (catIt.hasNext()) {
            totalCasts++;
            Category cat = (Category) catIt.next();         // Приведение #5
            System.out.println("Категория: " + cat.name);

            for (int i = 0; i < cat.products.size(); i++) {
                totalCasts++;
                Product p = (Product) cat.products.get(i);  // Приведение #6
                System.out.println("  - " + p.name);
            }
        }

        // Проблема: приведения в условиях
        System.out.println("\nПРИВЕДЕНИЯ В УСЛОВИЯХ:");
        Product first = products.size() > 0 ?
                (Product) products.get(0) : null;    // Приведение #7
        totalCasts++;

        if (first != null) {
            System.out.println("Первый продукт: " + first.name);
        }

        System.out.println("\n!!! ИТОГО ПРИВЕДЕНИЙ ТИПОВ: " + totalCasts + " !!!");
        System.out.println("!!! В ПРОСТОЙ ПРОГРАММЕ НА 20 СТРОК ЛОГИКИ !!!");
    }

    public void demonstrateForgottenCast() {
        System.out.println("\n=== ЗАБЫТОЕ ПРИВЕДЕНИЕ ТИПА ===\n");

        List items = new ArrayList();
        items.add(new Product("B001", "Монитор", 20000));

        try {
            // Проблема: забыли привести тип
            Object item = items.get(0);
            // item.name; // Ошибка компиляции - у Object нет поля name

            // Попытка вызвать метод без приведения
            System.out.println("Имя: " + item.toString()); // Работает, но не то что нужно

            // Правильный способ, но легко забыть
            Product p = (Product) item;
            System.out.println("Имя продукта: " + p.name);

        } catch (Exception e) {
            System.out.println("!!! ОШИБКА: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        CastingEverywhereProblem problem = new CastingEverywhereProblem();
        problem.demonstrateCastingHell();
    }
}

