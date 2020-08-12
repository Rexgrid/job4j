package ru.job4j.collections;


import org.junit.Assert;
import org.junit.Test;
import ru.job4j.collection.*;

import java.util.*;


import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByName() {
        Comparator<Job> cmpNamePriority = new JobDescByName();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, is(0));
    }

    @Test
    public void whenCompatorByNameRevers() {
        Comparator<Job> job = new JobDescByNameRevers();
            int rsl = job.compare(
                    new Job("Task1", 1),
                    new Job("Task", 2)
            );
            assertThat(rsl, greaterThan(0));
        }
     @Test
    public void whenCompatorByPriority() {
        Comparator<Job> job = new JobDescByPriority();
        int rsl = job.compare(
                new Job("task", 1),
                new Job("task1", 2)
        );
        assertThat(rsl, greaterThan(0));
     }
     @Test
    public void whenCompatorByPriorityRevers() {
        Comparator<Job> job = new JobDescByPriorityRevers();
        int rsl = job.compare(
                new Job("task", 1),
                new Job("task1", 2)
        );
        assertThat(rsl, lessThan(0));
     }
    }

