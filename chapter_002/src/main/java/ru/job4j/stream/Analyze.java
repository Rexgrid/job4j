package ru.job4j.stream;

import java.util.Collections;
import java.util.List;
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
            return List.of();
    }
    //Метод averageScoreByPupil вычисляет средний балл по всем предметам для каждого ученика.
    //Возвращает список из объекта Tuple (название предмета и средний балл).
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return List.of();
    }
    //Метод bestStudent - возвращает лучшего ученика. Лучшим считается ученик с наибольшим баллом по всем предметам
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return null;
    }
    //Метод bestSubject - возвращает предмет с наибольшим баллом для всех студентов.
    //Возвращает объект Tuple (имя предмета, сумма баллов каждого ученика по этому предмету)
    public static Tuple bestSubject(Stream<Pupil> stream) {
        return null;
    }
}
