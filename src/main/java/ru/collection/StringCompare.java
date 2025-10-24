package ru.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int lenString1 = o1.length();
        int lenString2 = o2.length();
        int minLenString = Math.min(lenString1, lenString2);
        for (int i = 0; i < minLenString; i++) {
            char characterCodeOfString1 = o1.charAt(i);
            char characterCodeOfString2 = o2.charAt(i);
            if (characterCodeOfString1 != characterCodeOfString2) {
                return characterCodeOfString1 - characterCodeOfString2;
            }
        }
        return lenString1 - lenString2;
    }
}
