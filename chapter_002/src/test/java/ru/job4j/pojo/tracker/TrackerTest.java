package ru.job4j.pojo.tracker;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenShowAll() {
        Tracker tracker = new Tracker();
        Item[] item = new Item[100];
        Item i = new Item("Task1");
        Item j = new Item("Task3");
        tracker.add(i);
        tracker.add(j);
        Item[] result = tracker.findAll();
        assertThat(result, is(new Item[]{i, j}));
    }

    @Test
    public void whenWeHaveAKeyWeMayFindById() {
        Tracker tracker = new Tracker();
        Item[] item = new Item[100];
        Item i = new Item("Task");
        Item j = new Item("Task2");
        tracker.add(j);
        tracker.add(i);
        j.setId("123");
        i.setId("214");
        Item result = tracker.findById("123");
        assertThat(result, is(j));
    }

    @Test
    public void whenWeHaveANameWeMayGetIt() {
        Tracker tracker = new Tracker();
        Item[] item = new Item[100];
        Item i = new Item("Task_001");
        Item j = new Item("Task_002");
        tracker.add(i);
        tracker.add(j);
        Item[] result = tracker.findByName("Task_002");
        assertThat(result, is(new Item[] {j}));
    }
    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }
    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }

}