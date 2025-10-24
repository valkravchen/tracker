package ru.collection;

import java.util.Comparator;

public class SortDescByNameJob implements Comparator<Job> {

    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

