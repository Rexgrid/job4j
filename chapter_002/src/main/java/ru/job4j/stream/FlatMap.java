package ru.job4j.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    static Integer[][] matrix = {
            {1, 3, 2, 3, 5},
            {4, 5, 1, 2}
    };
    public static void main(String[] args) {
        System.out.println(Stream.of(matrix).flatMap(Arrays::stream).collect(Collectors.toList()));
    }
}

