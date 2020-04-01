package ru.job4j.professions;

public class Dentist extends Doctor {

    public int numberTooth;
    public int cost;

    public Implant tooth(Diagnose man) {
        return new Implant();
    }
}
