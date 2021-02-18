package ru.job4j.tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[] rsl;
        int[] tmp = new int[right.length];
        int count = 0;
        for (int value : left) {
            for (int i : right) {
                if (value == i) {
                    tmp[count] = value;
                    count++;
                }
            }
        }
        rsl = Arrays.copyOf(tmp, count);
        return rsl;
    }
}
