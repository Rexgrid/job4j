package ru.job4j.professions;

public class Programmer extends Engineer {

    public double time;
    public String nameOfTask;

    public Coding code(Idea idea) {
        return new Coding();
    }
}
