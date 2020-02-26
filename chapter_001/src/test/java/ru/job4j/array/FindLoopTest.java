package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas3ThenNull() {
        FindLoop find1 = new FindLoop();
        int[] input = new int[] {2, 7, 8};
        int value = 3;
        int result = find1.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

}