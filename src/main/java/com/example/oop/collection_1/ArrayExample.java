package com.example.oop.collection_1;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        System.out.println(Arrays.toString(names));
        String[] newNames = new String[4];
        for (int i = 0; i < names.length; i++) {
            newNames[i] = names[i];
        }
        newNames[3] = "David";
        names = newNames;
        System.out.println(Arrays.toString(names));
        boolean found = false;
        for (String name : names) {
            if ("Bob".equals(name)) {
                found = true;
                break;
            }
        }
        System.out.println("Bob найден: " + found);

        String[] withoutBob = new String[names.length - 1];
        int index = 0;
        for (String name : names) {
            if (!"Bob".equals(name)) {
                withoutBob[index++] = name;
            }
        }
        System.out.println("Массив после удаления: " + Arrays.toString(withoutBob));
    }
}
