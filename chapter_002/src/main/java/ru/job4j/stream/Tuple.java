package ru.job4j.stream;

import java.util.Objects;

public class Tuple {
    private String name;
    private double score;

    public Tuple(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tuple tuple = (Tuple) o;
        return Double.compare(tuple.score, score) == 0 && Objects.equals(name, tuple.name);
    }

    static int compare(Tuple t1, Tuple t2) {
        if (t1.score > t2.score) {
            return 1;
        }
        return -1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}