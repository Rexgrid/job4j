package ru.job4j.condition;

import static org.hamcrest.core.Is.is;
import  static  org.junit.Assert.assertThat;
import org.junit.Test;


public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(2, 2);
        Point b = new Point(4, 3);
        double result = a.distance(b);
        assertThat(result, is(2.23606797749979));
    }

    @Test
    public void distance3D() {
        Point a = new Point(3, 4,  3);
        Point b = new Point(4, 2, 5);
        double result = a.distance3d(b);
        assertThat(result, is(3.0));
    }
}

