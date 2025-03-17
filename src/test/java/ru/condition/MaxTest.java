package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    public void whenMaxSecond() {
        assertThat(Max.max(1, 2)).isEqualTo(2);
    }

    @Test
    public void whenMaxFirst() {
        assertThat(Max.max(3, 2)).isEqualTo(3);
    }

    @Test
    public void whenEquals() {
        assertThat(Max.max(4, 4)).isEqualTo(4);
    }
}