package ru.job4j.professions;

public class Builder extends Engineer {

    public double time;
    public int people;

    public Build garage(Materials people) {
        return new Build();
    }
}
