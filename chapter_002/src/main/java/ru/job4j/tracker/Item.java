package ru.job4j.tracker;

import java.util.Comparator;
import java.util.Objects;

public class Item implements Comparable<Item> {
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "id заявки : '" + id + '\'' + ", имя заявки: '" + name + '\'';
    }

    @Override
    public boolean equals(Object obj) {
       boolean result  = super.equals(obj);
       if (obj instanceof Item) {
           Item item = (Item) obj;
           if (this.name.equals(item.name) && this.id.equals(item.id)) {
               result = true;
           }
       }
       return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Item another) {
        return this.id.compareTo(another.getId());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
