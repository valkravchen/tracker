package ru.collection;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class JobCombinedComparatorTest {
    @Test
    public void whenComparatorByNameAndPriorityAsc() {
        List<Job> jobs = Arrays.asList(
                new Job("A", 2),
                new Job("B", 1),
                new Job("A", 1),
                new Job("B", 2)
        );
        List<Job> expected = Arrays.asList(
                new Job("A", 1),
                new Job("A", 2),
                new Job("B", 1),
                new Job("B", 2)
        );
        jobs.sort(new SortByNameJob().thenComparing(new SortByPriorityJob()));
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenComparatorByPriorityAndNameAsc() {
        List<Job> jobs = Arrays.asList(
                new Job("A", 2),
                new Job("B", 1),
                new Job("A", 1),
                new Job("B", 2)
        );
        List<Job> expected = Arrays.asList(
                new Job("A", 1),
                new Job("B", 1),
                new Job("A", 2),
                new Job("B", 2)
        );
        jobs.sort(new SortByPriorityJob().thenComparing(new SortByNameJob()));
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenComparatorByNameDescAndPriorityDesc() {
        List<Job> jobs = Arrays.asList(
                new Job("A", 2),
                new Job("B", 1),
                new Job("A", 1),
                new Job("B", 2)
        );
        List<Job> expected = Arrays.asList(
                new Job("B", 2),
                new Job("B", 1),
                new Job("A", 2),
                new Job("A", 1)
        );
        jobs.sort(new SortDescByNameJob().thenComparing(new SortDescByPriorityJob()));
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenComparatorByPriorityDescAndNameAsc() {
        List<Job> jobs = Arrays.asList(
                new Job("A", 2),
                new Job("B", 1),
                new Job("A", 1),
                new Job("B", 2)
        );
        List<Job> expected = Arrays.asList(
                new Job("A", 2),
                new Job("B", 2),
                new Job("A", 1),
                new Job("B", 1)
        );
        jobs.sort(new SortDescByPriorityJob().thenComparing(new SortByNameJob()));
        assertThat(jobs).isEqualTo(expected);
    }
}
// for review