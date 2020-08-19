package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        for (String i : left.split("[^0-9]")) {
            for (String j : right.split("[^0-9]")) {
                int x = Integer.parseInt(i);
                int y = Integer.parseInt(j);
                if (x != y) {
                    result = x - y;
                }
            }
        }
        return result;
    }

}

