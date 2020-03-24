package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point first = new Point(13, 1);
        Point second = new Point(2, 4);
        Point third = new Point(2, 3);
        Triangle trg = new Triangle(first, second, third);
        double result = trg.area();
        assertThat(result, is(5.49999999999999));

    }

    @Test
    public void whenNotExist() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 0);
        Point third = new Point(0, 0);
        Triangle trg = new Triangle(first, second, third);
        double result = trg.area();
        assertThat(result, is(-1.0));
    }
}