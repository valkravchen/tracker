package ru.ex;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CountTest {
    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Count.add(3, 1);
                }
        );
        assertThat(exception.getMessage()).isEqualTo("Start should be less than finish.");
    }

    @Test
    public void whenNoException() {
        int start = 0;
        int finish = 3;
        int expected = 3;
        int result = Count.add(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}