package ru.collection;

import java.util.Comparator;
import java.util.Queue;

public class SortDescByNameJob implements Comparator<Job> {

    @Override
    public int compare(Job left, Job right) {
        return right.getName().compareTo(left.getName());
    }
}
