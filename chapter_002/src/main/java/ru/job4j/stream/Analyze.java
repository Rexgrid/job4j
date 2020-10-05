package ru.job4j.stream;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    //Метод averageScore вычисляет общий средний балл
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(x -> x.getSubjects().stream()).mapToDouble(Subject::getScore).average().getAsDouble();
    }
    //Метод averageScoreBySubject вычисляет средний балл ученика по его предметам.
    //Возвращает список из объекта Tuple (имя ученика и средний балл).
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
            return stream.map(x -> new Tuple(x.getName(), x.getSubjects().stream().mapToDouble(Subject::getScore).average().getAsDouble())).collect(Collectors.toList());
    }
    //Метод averageScoreByPupil вычисляет средний балл по всем предметам для каждого ученика.
    //Возвращает список из объекта Tuple (название предмета и средний балл).
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(x -> x.getSubjects().stream()
                .collect(Collectors.groupingBy(Subject::getName, Collectors.averagingDouble(Subject::getScore)))
                .entrySet().stream().map(m -> new Tuple(m.getKey(), m.getValue())))
                .collect(Collectors.toList());
    }
    //Метод bestStudent - возвращает лучшего ученика. Лучшим считается ученик с наибольшим баллом по всем предметам
  public static Tuple bestStudent(Stream<Pupil> stream) {
       return stream.map(x -> new Tuple(x.getName(), x.getSubjects().stream().mapToDouble(Subject::getScore).sum())).max(Tuple::compare).orElse(null);
    }
    //Метод bestSubject - возвращает предмет с наибольшим баллом для всех студентов.
    //Возвращает объект Tuple (имя предмета, сумма баллов каждого ученика по этому предмету)
    public static Tuple bestSubject(Stream<Pupil> stream) {

        return null;



   }

}
