package com.map;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String text = "java хорошо java изучать java весело программировать java";
        Map<String, Integer> wordCount = new HashMap<>();
        System.out.println("=== ПОДСЧЁТ ЧАСТОТЫ СЛОВ ===\n");
        System.out.println("Исходный текст: " + text);
        String[] words = text.split(" ");
        for (String word : words) {
            Integer currentCount = wordCount.getOrDefault(word, 0);
            wordCount.put(word, currentCount + 1);
        }
        System.out.println("\nЧастота слов:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            String word = entry.getKey();
            Integer count = entry.getValue();
            System.out.println("  '" + word + "' встречается " + count + " раз");
        }
        String mostFrequent = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("\nСамое частое слово: '" + mostFrequent + "' (" + maxCount + " раз)");
    }
}
