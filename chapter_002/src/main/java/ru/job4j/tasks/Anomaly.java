package ru.job4j.tasks;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result;
        int[][] temp = new int[data.length][data.length];
        int count = 0;
        int index = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                if (data[i] <= down || data[i] >= up) {
                    temp[index][count] = i;
                    count++;
                    break;
                }
            }
        }
        if (count == 1) {
            temp[index][count] = temp[index][count - 1];
        }
        if (count < data.length && count != 0) {
            count = 1;
        }
        result = new int[index][count];

        return result;
    }
}

