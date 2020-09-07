package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }

    Map<String, Student> students(List<Student> student) {
        return  student.stream().collect(Collectors.toMap(Student::getSurname, e -> e, ((student1, student2) -> student1.getScore() > student2.getScore() ? student1 : student2)));
    }
}
