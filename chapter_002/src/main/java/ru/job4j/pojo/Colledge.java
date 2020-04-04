package ru.job4j.pojo;

import java.util.Date;

public class Colledge {
        public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alexander Devyatkin");
        student.setGroup("A");
        student.setStartedDate("01.02.2020");
        System.out.println(student.getName() + " been studying on group " + student.getGroup() + " since " + student.getStartedDate());
    }
}
