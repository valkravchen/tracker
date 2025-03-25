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
}






