package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RangeFuncTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = RangeFunc.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = RangeFunc.diapason(5, 7, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = RangeFunc.diapason(2, 4, x -> Math.pow(2D, x));
        List<Double> expected = Arrays.asList(4D, 8D);
        assertThat(result, is(expected));
    }
}
