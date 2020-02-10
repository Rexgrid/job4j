package ru.job4j.converter;

public class Converter {
        public static int rubleToEuro(int value) {
            int rsl = value / 70;
            return rsl;
        }

        public static int rubleToDollar(int value) {
            int rsl = value / 60; // формула перевода рублей в доллоры.
            return rsl;
        }
        public static int euroToRubles(int value){
            int rsl = value * 70;
            return rsl;
        }
        public static int dollarToRubles (int value){
            int rsl = value * 60;
            return rsl;
        }

        public static void main(String[] args) {
            int in = 140;
            int expected = 2;
            int out = rubleToEuro(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2 euro" + passed);
            int in1 = 240;
            int expected1 = 4;
            int out1 = rubleToDollar(in1);
            boolean passed1 = expected1 == out1;
            System.out.println("240 rubles are 4 dollar " +passed1);
            int in2 = 5;
            int expected2 = 300;
            int out2 = dollarToRubles(in2);
            boolean passed2 = expected2 == out2;
            System.out.println("5 dollars are 300 rubles " + passed2);
            int in3 = 8;
            int expected3 = 560;
            int out3 = euroToRubles(in3);
            boolean passed3 = expected3 == out3;
            System.out.println("8 euro are 560 rubles " + passed3);
        }
    }
