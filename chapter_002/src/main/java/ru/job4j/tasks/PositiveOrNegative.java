package ru.job4j.tasks;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        boolean result = false;
        int posCount = 0;
        int negCount = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                posCount++;
            } else {
                negCount++;
            }
        }
        if (negCount % 2 != 0) {
            result = true;
        }
        return result;
    }
}
