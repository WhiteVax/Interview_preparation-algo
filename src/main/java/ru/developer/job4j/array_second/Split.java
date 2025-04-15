package ru.developer.job4j.array_second;

import java.util.Arrays;

/**
 * Написать метод схожий с Split
 */
public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int count = 0;
        int start = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == c) {
               result[count++] = Arrays.copyOfRange(str, start, i);
               start = i + 1;
            }
        }

        if (start <= str.length) {
            result[count++] = Arrays.copyOfRange(str, start, str.length);
        }
        return Arrays.copyOf(result, count);
    }
}
