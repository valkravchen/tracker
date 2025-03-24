package ru.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {

    @Test
    void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Factorial().calc(-5);
                });
        assertThat(exception.getMessage()).isEqualTo("Number cannot be a negative number.");
    }

    @Test
    void whenNoException() {
        int number = 3;
        int result = new Factorial().calc(number);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}