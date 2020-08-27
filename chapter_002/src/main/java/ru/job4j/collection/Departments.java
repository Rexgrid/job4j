package ru.job4j.collection;

import java.util.*;

import static java.util.Comparator.naturalOrder;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new TreeSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (!start.equals("")) {
                    tmp.add(start + "/" + el);
                    start = start + "/" + el;
                } else {
                    tmp.add(el);
                    start = el;
                }
            }
        }
        return new ArrayList<>(tmp);
    }


    public static void sortAsc(List<String> orgs) {
        orgs.sort(naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}
