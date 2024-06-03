package ru.developer.codewars.cata_8;

/**
 * Create a function that accepts a string and a single character, and returns an integer of the count of occurrences
 * the 2nd argument is found in the first one.
 */
public class StrCount {
    public static int strCount(String str, char letter) {
        int rsl = 0;
        if (str != null && !str.isEmpty() && Character.isLetter(letter)) {
            for (var ch: str.toCharArray()) {
                rsl = ch == letter ? rsl + 1 : rsl;
            }
        }
        return rsl;
    }
}
