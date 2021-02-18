package ru.job4j.tasks;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int count = 0;
        int k = 0;
        int[] temp = new int[data.length * data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                    count++;
                }
                if (data[i][j] != 0) {
                    temp[k] = data[i][j];
                    k++;
                }
            }
        }
        return Arrays.copyOf(temp, (data.length * data.length) - count);
    }
}