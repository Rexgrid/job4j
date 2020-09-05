package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(i -> i.getAddress()).collect(Collectors.toList());
    }

    public List<Address> sorted(List<Address> collect) {
        return collect.stream().sorted(new SortByCity()).distinct().collect(Collectors.toList());
    }
}
