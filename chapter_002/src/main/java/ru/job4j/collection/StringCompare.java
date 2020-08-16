package ru.job4j.collection;

        import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            char a1 = left.charAt(i);
            char a2 = right.charAt(i);
            if (a1 != a2) {
                return a1 - a2;
            }
        }
        return left.length() - right.length();
    }
}

