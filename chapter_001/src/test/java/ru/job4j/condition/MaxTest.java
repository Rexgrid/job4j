package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2to1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2to2the2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3to1to0Then3() {
        int result = Max.max(0, 1, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax5to1to3to6Then6() {
        int result = Max.max(5, 1, 3, 6);
        assertThat(result, is(6));
    }
}
