package ru.job4j.professions;

public class Engineer extends Profession {

    public String materials;
    public int workers;

    public Design build(Home home) {
      return new Design();
    }
}
