package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4() {
        int first = 3;
        int second = 1;
        int third = 4;
        int result = Max.max(first, second, third);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax9() {
        int first = 3;
        int second = 1;
        int third = 4;
        int forth = 9;
        int result = Max.max(first, second, third, forth);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}