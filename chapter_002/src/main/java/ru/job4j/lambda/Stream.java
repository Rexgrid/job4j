package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(-1, -2, -3, 0, 1, 2, 3));
        List<Integer> nums = numbers.stream().filter(n -> n > 0).collect(Collectors.toList());
        nums.forEach(System.out::println);
    }
}

