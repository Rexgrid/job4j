package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;




public class SortByIdTest {
    @Test
    public void whenSortById() {
        List<Item> items = Arrays.asList(
                new Item("Task", 3),
                new Item("Task1", 2),
                new Item("Task2", 1)
        );
        Collections.sort(items, new SortById());
        List<Item> expected = Arrays.asList(
                new Item("Task2", 1),
                new Item("Task1", 2),
                new Item("Task", 3)
        );
        assertThat(items, is(expected));
    }

    @Test
    public void  whenSortByIdIsReverse() {
        List<Item> items = Arrays.asList(
                new Item("Task", 1),
                new Item("Task1", 2),
                new Item("Task2", 3)
        );
        Collections.sort(items, new SortByIdReverse());
        List<Item> expected = Arrays.asList(
                new Item("Task2", 3),
                new Item("Task1", 2),
                new Item("Task", 1)
        );
        assertThat(items, is(expected));
    }
}
