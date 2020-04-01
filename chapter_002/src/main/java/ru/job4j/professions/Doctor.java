package ru.job4j.professions;

public class Doctor extends  Profession {

    public double timeOfHeal;
    public int cost;

    public Diagnose heal(Pacient pacient) {
        return new Diagnose();
    }
}
