package ru.job4j.stream;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.job4j.stream.School;
import java.util.stream.Collectors;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void whenCGroup() {
        School school = new School();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivanov", 20));
        students.add(new Student("Petrov", 5));
        students.add(new Student("Sidorov", 75));
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("Ivanov", 20));
        expected.add(new Student("Petrov", 5));
        List<Student> result = school.collect(students, s -> s.getScore() < 50);
        assertThat(result, is(expected));
    }

    @Test
    public void whenBGroup() {
        School school = new School();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivanov", 55));
        students.add(new Student("Petrov", 60));
        students.add(new Student("Sidorov", 75));
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("Ivanov", 55));
        expected.add(new Student("Petrov", 60));
        List<Student> result = school.collect(students, s -> s.getScore() > 50 && s.getScore() < 70);
        assertThat(result, is(expected));
    }

    @Test
    public void whenAGroup() {
        School school = new School();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivanov", 20));
        students.add(new Student("Petrov", 5));
        students.add(new Student("Sidorov", 75));
        students.add(new Student("Levchenko", 80));
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("Sidorov", 75));
        expected.add(new Student("Levchenko", 80));
        List<Student> result = school.collect(students, s -> s.getScore() > 70);
        assertThat(result, is(expected));
    }
}
