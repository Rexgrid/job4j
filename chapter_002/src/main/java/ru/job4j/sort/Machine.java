package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int ost = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (ost > 0) {
                if (ost - coins[i] >= 0) {
                    ost = ost - coins[i];
                    rsl[i] = coins[i];
                    size++;
                } else if (ost - coins[i] < 0) {
                    i++;
                } else {
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}