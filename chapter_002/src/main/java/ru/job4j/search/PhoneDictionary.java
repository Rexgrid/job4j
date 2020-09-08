package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */


    public ArrayList<Person> find(String key) {
        Predicate<Person>  combineName = s -> s.getName().equals(key);
        Predicate<Person> combineSurname = s -> s.getSurname().equals(key);
        Predicate<Person> combineAddress = s -> s.getAddress().equals(key);
        Predicate<Person> combinePhone = s -> s.getPhone().equals(key);
        Predicate<Person> combine = combineAddress.or(combineName.or(combinePhone.or(combineSurname)));
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}

 //