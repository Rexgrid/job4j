package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void when3Max() {
        SqMax check = new SqMax();
        int result = check.max(6, 4, 7, 5);
        assertThat(result, is(7));
    }

    @Test
    public void when2Max() {
        SqMax check = new SqMax();
        int result = check.max(6, 9, 7, 5);
        assertThat(result, is(9));
    }
}
