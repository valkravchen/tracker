package com.collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetIteration {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>();
        words.add("java");
        words.add("python");
        words.add("cpp");
        words.add("javascript");
        words.add("go");
        System.out.println("=== СПОСОБЫ ПЕРЕБОРА TREESET ===\n");
        System.out.println("Слова: " + words);
        System.out.println("\n1. Enhanced for (по возрастанию):");
        for (String word : words) {
            System.out.println("   " + word);
        }
        System.out.println("\n2. Iterator (по возрастанию):");
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            System.out.println("   " + iterator.next());
        }

        TreeSet<String> treeWords = (TreeSet<String>) words;
        System.out.println("\n3. Обратный порядок (по убыванию):");
        Iterator<String> reverseIterator = treeWords.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println("   " + reverseIterator.next());
        }
    }
}
