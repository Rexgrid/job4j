package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Alex";
        names[1] = "Mathew";
        names[2] = "Grisha";
        names[3] = "Josh";
        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i]);
        }

    }

}
