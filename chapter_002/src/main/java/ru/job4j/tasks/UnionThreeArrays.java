package ru.job4j.tasks;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] result = new int[2 + (middle.length / 2) + (right.length / 2)];
        int k = 2;
        int o = 1;
        result[0] = left[0];
        result[result.length - 1] = left[left.length - 1];
        for (int i = 0; i < middle.length; i++) {
            if (i % 2 != 0) {
                result[k] = middle[i];
                k = k + 2;
            }
        }
        for (int j = 0; j < right.length; j++) {
            if (j % 2 == 0) {
                result[o] = right[j];
                o = o + 2;
            }
        }
        return result;
    }
}
