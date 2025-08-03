package com.example.oop._13_2_ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Petr");
        names.set(0, "Ivan");
        names.remove(0);
        for (Object value : names) {
            System.out.println(value);
        }
    }
}
