package ru.job4j.weight;

public class Weight {
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }


    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Weight.manWeight(190);
        System.out.println("Man 190 is " + man);
        double woman = Weight.womanWeight(150);
        System.out.println("Woman 150 is " + woman);
    }

}
