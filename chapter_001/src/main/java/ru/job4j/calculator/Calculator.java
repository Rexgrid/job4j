package ru.job4j.calculator;

/**
 * Class Клас для вычесления арифметических операций + - / *
 * @author Devyatkin
 * @since 20.02.2020
 * @version 1.0
 */


public class Calculator {
    /**
     * Main
     * @param args - args
     */
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int four = 4;
        int five = 5;
        int six = 6;
        int sixDivTwo = six/two;
        int onePlusTwo = one + two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
    }
}
