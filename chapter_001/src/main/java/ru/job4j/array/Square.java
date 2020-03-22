package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rsl = new int[bound];
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = i * i; // заполнить массив через цикл элементами от 0 до bound возведенными в квадрат
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
