package ru.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Integer first = 1;
        Integer second = 2;
        int result = first.compareTo(second);
        System.out.println(result);
    }
}
