package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tracker {

    private final List<Item> items = new ArrayList<>();

    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> rsl = new ArrayList<>();
        for (Item value : items) {
            if (value.getName().equals(key)) {
                rsl.add(value);
            }
        }
        return rsl;
    }


    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public boolean replace(String id, Item item) {
        boolean result = false;
        int ind = indexOf(id);
        if (ind != -1) {
            item.setId(id);
            result = true;
           items.set(ind, item);
        }
               return result;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(String id) {
        boolean rsl = false;
        int ind = indexOf(id);
        if (ind != -1) {
            items.remove(ind);
            rsl = true;
        }
        return rsl;
    }


    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }


}
