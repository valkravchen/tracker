package ru.collection;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

class SortByPriorityJobTest {

    @Test
    public void whenSortByPriorityAsc() {
        List<Job> jobs = Arrays.asList(
                new Job("Task3", 5),
                new Job("Task1", 1),
                new Job("Task2", 3)
        );
        List<Job> expected = Arrays.asList(
                new Job("Task1", 1),
                new Job("Task2", 3),
                new Job("Task3", 5)
        );
        jobs.sort(new SortByPriorityJob());
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenPrioritiesAreSame() {
        List<Job> jobs = Arrays.asList(
                new Job("Task1", 2),
                new Job("Task2", 2),
                new Job("Task3", 2)
        );
        List<Job> expected = Arrays.asList(
                new Job("Task1", 2),
                new Job("Task2", 2),
                new Job("Task3", 2)
        );
        jobs.sort(new SortByPriorityJob());
        assertThat(jobs).isEqualTo(expected);
    }
}