package ru.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ivanov@yandex.ru", "Иванов Иван Иванович");
        map.put("petrov@yandex.ru", "Петров Пётр Петрович");
        map.put("alekseev@yandex.ru", "Алексеев Алексей Алексеевич");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}


