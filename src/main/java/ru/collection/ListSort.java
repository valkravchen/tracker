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
        Integer second = 4;
        int result = first.compareTo(second);
        System.out.println(result);
        String petr = "Petr";
        String ivan = "Ivan";
        int resultString = petr.compareTo(ivan);
        System.out.println(resultString);
        list.sort(Collections.reverseOrder());
        System.out.println(list);
    }
}
