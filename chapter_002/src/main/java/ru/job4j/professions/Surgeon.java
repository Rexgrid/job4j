package ru.job4j.professions;

public class Surgeon extends Doctor {

    public double timeOfSurgery;
    public String bloodGroup;

    public Surgery man(Diagnose heal) {
        return new Surgery();
    }
}
