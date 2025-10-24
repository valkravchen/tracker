package ru.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCompareTest {

    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenLeftEmptyThenNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare("", "A");
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenRightEmptyThenPositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare("A", "");
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenLastCharDifferentThenCompareByIt() {
        StringCompare compare = new StringCompare();
        int result = compare.compare("abc", "abd");
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenCaseDiffThenCompareByUnicode() {
        StringCompare compare = new StringCompare();
        int result = compare.compare("a", "A");
        assertThat(result).isGreaterThan(0);
    }
}