package ru.job4j.collection;

import java.util.*;

import static java.util.Comparator.naturalOrder;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
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
        TreeSet sortedTree = new TreeSet();
        sortedTree.addAll(tmp);
        return new ArrayList<>(sortedTree);
    }


    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
    }
}
