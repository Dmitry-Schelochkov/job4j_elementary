package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }

    @Test
    void when20to20then0() {
        double expected = 0;
        Point a = new Point(2, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }

    @Test
    void when84to42then4dot47() {
        double expected = 4.47;
        Point a = new Point(8, 4);
        Point b = new Point(4, 2);
        double output = a.distance(b);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }

    @Test
    void when41to11then3() {
        double expected = 3;
        Point a = new Point(4, 1);
        Point b = new Point(1, 1);
        double output = a.distance(b);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }

    @Test
    void when024to248then4dot89() {
        double expected = 4.89;
        Point c = new Point(0, 2, 4);
        Point d = new Point(2, 4, 8);
        double output = c.distance3d(d);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }

    @Test
    void when222to000hen3dot46() {
        double expected = 3.46;
        Point c = new Point(2, 2, 2);
        Point d = new Point(0, 0, 0);
        double output = c.distance3d(d);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }


}