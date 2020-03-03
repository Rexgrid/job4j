package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        int count = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = count++;
            }
        }
    }
}