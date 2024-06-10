package ru.developer.codewars.cata_7;

public class MaxDiff {
    public static int maxDiff(int[] lst) {
        int rsl = 0;
        if (lst.length > 2) {
            int max = lst[0];
            int min = lst[0];
            for (int j : lst) {
                if (j > max) {
                    max = j;
                }
                if (j < min) {
                    min = j;
                }
            }
            rsl = max - min;
        }
        return rsl;
    }
}
