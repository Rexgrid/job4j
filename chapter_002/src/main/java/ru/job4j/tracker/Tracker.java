package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[position];
        int size = 0;
        for (int index = 0; index < this.items.length; index++) {
            Item name = items[index];
            if (name != null) {
                itemsWithoutNull[size] = name;
                size++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
        for (int index = 0; index < itemsWithoutNull.length; index++) {
            System.out.println(itemsWithoutNull[index]);
        }
    return  itemsWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[items.length];
        int size = 0;
        for (int index = 0; index < this.items.length; index++) {
            if (items[index] != null && this.items[index].getName().equals(key)) {
                rsl[size] = items[index];
                size++;
            }
        }
        rsl = Arrays.copyOf(rsl, size);
        return rsl;
    }

    public Item findById(String id) {
        for (int index = 0; index < this.items.length; index++) {
            if (this.items[index].getId().equals(id)) {
                return   items[index];
            }
        }
        return null;
    }


    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }


}
