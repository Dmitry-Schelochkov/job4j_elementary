package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int number = 5;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int number = 0;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForThreeThenSix() {
        int expected = 6;
        int number = 3;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForFourThenTwentyfour() {
        int expected = 24;
        int number = 4;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }
}