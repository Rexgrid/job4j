package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MemTracker implements Store {

    private final List<Item> items = new ArrayList<>();

    @Override
    public void init() {
        MemTracker memTracker = new MemTracker();
    }

    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
        return item;
    }

    @Override
    public boolean replace(int id, Item item) {
        boolean result = false;
        int ind = indexOf(id);
        if (ind != -1) {
            item.setId(id);
            result = true;
            items.set(ind, item);
        }
        return result;
    }

    @Override
    public boolean delete(int id) {
        boolean rsl = false;
        int ind = indexOf(id);
        if (ind != -1) {
            items.remove(ind);
            rsl = true;
        }
        return rsl;
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

    @Override
       public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }



    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private int generateId() {
        Random rm = new Random();
        return (int) (rm.nextLong() + System.currentTimeMillis());
    }


    @Override
    public void close() throws Exception {

    }
}
