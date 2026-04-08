package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void when0To10ThenSum55() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when3To8ThenSum33() {
        int start = 3;
        int finish = 8;
        int result = Counter.sum(start, finish);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when1To2ThenSum3() {
        int start = 1;
        int finish = 2;
        int result = Counter.sum(start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when5To1ThenSum0() {
        int start = 5;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}