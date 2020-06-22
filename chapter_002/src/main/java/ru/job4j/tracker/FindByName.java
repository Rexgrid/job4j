package ru.job4j.tracker;

import java.util.List;

public class FindByName implements UserAction {

    @Override
    public String name() {
        return "======== Поиск заявки по имени ========";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String key = input.askStr("Введите имя заявки: ");
        List<Item> item = tracker.findByName(key);
        for (Item value : item) {
            System.out.println(" " + value + " найдена.");
        }
        return true;
    }
}


