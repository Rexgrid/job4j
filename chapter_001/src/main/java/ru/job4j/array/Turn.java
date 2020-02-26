package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int tmp = 0; tmp < array.length - tmp; tmp++) {
        int temp = array[tmp];
        array[tmp] = array[array.length - tmp - 1];
        array[array.length - tmp - 1] = temp;
        }
        return array;
    }
}

