package ru.job4j.tasks;

import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < rsl.length; i++) {
            if (left.length == 0) {
                System.arraycopy(right, rightIndex, rsl, i++, right.length);
                break;
            }
            if (right.length == 0) {
                System.arraycopy(left, leftIndex, rsl, i++, left.length);
                break;
            }
            rsl[i] = left[leftIndex] < right[rightIndex] ? left[leftIndex++] : right[rightIndex++];
            if (leftIndex == left.length) {
                System.arraycopy(right, rightIndex, rsl, ++i, right.length - rightIndex);
                break;
            }
            if (rightIndex == right.length) {
                System.arraycopy(left, leftIndex, rsl, ++i, left.length - leftIndex);
                break;
            }
        }
        return rsl;
    }
}
