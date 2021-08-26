package ru.job4j.tasks;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int[][] temp;
        int count = 0;
        int row = 0;
        int cell = 0;
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                count++;
            }
        }
        if (count % 3 == 0) {
            int a = count / 3;
            temp = new int[a][a];
        } else {
            temp = new int[array.length][array.length];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                temp[row][cell] = array[i][j];
                cell++;
                if (cell > temp[row].length - 1) {
                    row++;
                    cell = 0;
                }
            }

        }
        return temp;
    }
}