package ru.job4j.tasks;

public class Initials {
    public static String convert(String[] fio) {
        String surname = fio[0];
        char name  = fio[1].charAt(0);
        char lastName = fio[2].charAt(0);
        return surname + " " + name + "." + lastName + ".";
    }
}
