package ru.developer.codewars.cata_7;

/**
 * Return the number (count) of vowels in the given string.
 * We will consider a, e, i, o, u as vowels for this Kata (but not y).
 * The input string will only consist of lower case letters and/or spaces.
 */
public class Vowels {
    public static int getCount(String str) {
        return (int) str.chars()
                .filter(ch -> "aeiou".indexOf(ch) >= 0)
                .count();
    }
}
