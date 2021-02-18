package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Article {
    public static boolean generateBy(String origin, String line) {
        String[] wordsOrigin = origin.split("\\s*(\\s|,|!|\\.)\\s*");
        String[] wordsLine = line.split("\\s*(\\s|,|!|\\.)\\s*");
        HashMap<Integer, String> origMap = new HashMap<>();
        for (int i = 0; i < wordsOrigin.length; i++) {
            origMap.put(i, wordsOrigin[i]);
        }
        HashMap<Integer, String> lineMap = new HashMap<>();
        for (int i = 0; i < wordsLine.length; i++) {
            lineMap.put(i, wordsLine[i]);
        }
        return origMap.values().containsAll(lineMap.values());
    }

}

