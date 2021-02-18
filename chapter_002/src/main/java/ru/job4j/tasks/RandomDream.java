package ru.job4j.tasks;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String rsl = null;
        int count = 0;
        while (count <= num) {
            for (int i = 0; i < prizes.length; i++) {
                count++;
                if (i + 1 > prizes.length) {
                    i = 0;
                } else if (count == num) {
                    rsl = prizes[i];
                }
            }
        }
        return rsl;
    }
}