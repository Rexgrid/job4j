package ru.job4j.tracker;

import java.util.Comparator;

public class SortByIdReverse implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return second.getId().compareTo(first.getId());
    }
}

