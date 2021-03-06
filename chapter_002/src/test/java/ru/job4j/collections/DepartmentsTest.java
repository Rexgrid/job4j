package ru.job4j.collections;

import org.hamcrest.core.Is;
import org.junit.Test;
import ru.job4j.collection.DepDescComp;
import ru.job4j.collection.Departments;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringJoiner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = List.of("k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = List.of("k1", "k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenAscSorted() {
        List<String> input = Arrays.asList("K2/SK1/SSK2", "K2", "K2/SK1");
        Departments.sortAsc(input);
        List<String> expected = List.of("K2", "K2/SK1", "K2/SK1/SSK2");
        assertThat(input, is(expected));
    }

    @Test
    public void whenDescSorted() {
        List<String> input = Arrays.asList("K1", "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2", "K2", "K2/SK1", "K2/SK1/SSK1", "K2/SK1/SSK2");
        Departments.sortDesc(input);
        List<String> expected = List.of("K2", "K2/SK1", "K2/SK1/SSK1", "K2/SK1/SSK2", "K1", "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2");
        assertThat(input, is(expected));
    }
}