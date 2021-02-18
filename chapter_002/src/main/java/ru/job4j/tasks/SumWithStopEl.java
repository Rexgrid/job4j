package ru.job4j.tasks;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int sum = 0;
        int result = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                for (int j = 0; j < data[i] - 1; j++) {
                    sum = sum + data[j];
                    result = sum;
                }
            }
        }
        if (result % 2 != 0) {
            result = 0;
        }
        return result;
    }
}
