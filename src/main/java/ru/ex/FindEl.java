package ru.ex;

import java.util.Objects;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int index = 0; index < value.length; index++) {
            if (Objects.equals(key, value[index])) {
                return index;
            }
        }
        throw new ElementNotFoundException("Элемент '" + key + "' не найден в массиве");
    }

    public static void main(String[] args) {
        String[] cities = {"Ростов-на-Дону", "Углич", "Шахты"};
        String city = "Угл";
        try {
            int index = indexOf(cities, city);
            System.out.println("Элемент найден на позиции: " + index);
        } catch (ElementNotFoundException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}






