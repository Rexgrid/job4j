package ru.job4j.oop;

public class Student {

    public void song() {
        System.out.println("i belive i can fly");
    }

    public void music() {
        System.out.println("tra tra tra");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.song();
        petya.song();
        petya.song();
        petya.music();
        petya.music();
        petya.music();
    }
}
