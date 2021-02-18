package ru.job4j.tasks;

import java.util.*;

public class FreezeStr {
    public static boolean eq(String left, String right) {
       char[] rightAfterSplit = left.toCharArray();
        char[] leftAfterSplit = right.toCharArray();
        HashMap<Integer, Character> rightMap = new HashMap<>();
        for (int i = 0; i < rightAfterSplit.length; i++) {
            rightMap.put(i, rightAfterSplit[i]);
        }
        HashMap<Integer, Character> leftMap = new HashMap<>();
        for (int i = 0; i < leftAfterSplit.length; i++) {
            leftMap.put(i, leftAfterSplit[i]);
        }
        List<Character> values = new ArrayList<>(rightMap.values());
        List<Character> values1 = new ArrayList<>(leftMap.values());
        Collections.sort(values);
        Collections.sort(values1);
        return values.equals(values1);
    }
}
