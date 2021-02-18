package ru.job4j.tasks;

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int max = 0;
        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
            } else if (ints[i] < min) {
                min = ints[i];
            }
        }
        return max - min;
    }
}
