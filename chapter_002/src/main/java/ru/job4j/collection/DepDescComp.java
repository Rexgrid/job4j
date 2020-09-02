package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] lft = o1.split("/");
        String[] rgh = o2.split("/");
        int rsl = rgh[0].compareTo(lft[0]);
        if (rsl != 0) {
            return rsl;
        } else {
            return lft[0].compareTo(rgh[0]);
        }
    }
}