package ru.collection;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

class SortByNameJobTest {

    @Test
    public void whenSortByNameAsc() {
        List<Job> jobs = Arrays.asList(
                new Job("C", 3),
                new Job("A", 1),
                new Job("B", 2)
        );
        List<Job> expected = Arrays.asList(
                new Job("A", 1),
                new Job("B", 2),
                new Job("C", 3)

        );
        jobs.sort(new SortByNameJob());
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenNamesAreSame() {
        List<Job> jobs = Arrays.asList(
                new Job("A", 3),
                new Job("A", 1),
                new Job("A", 2)
        );
        List<Job> expected = Arrays.asList(
                new Job("A", 3),
                new Job("A", 1),
                new Job("A", 2)
        );
        jobs.sort(new SortByNameJob());
        assertThat(jobs).isEqualTo(expected);
    }
}