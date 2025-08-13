package ru.collection;

import java.util.*;

public class FullSearch {
    public Set<String> extractNumber(List<Task> tasks) {
        Set<String> uniqueNumbers = new HashSet<>();
        for (Task task : tasks) {
            uniqueNumbers.add(task.getNumber());
        }
        return uniqueNumbers;
    }
}
