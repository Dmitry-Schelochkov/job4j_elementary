package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusTenToTenThenThirty() {
        int start = -8;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}