package ru.job4j.collection;

import java.util.HashMap;
import java.util.HashSet;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("asd@gmail.com", "Alexander Pushkin");
        map.put("dsa@yandex.ru", "Mike Miller");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
