package ru.developer.codewars.cata_7;

import java.util.stream.Stream;

/**
 * Simple, given a string of words, return the length of the shortest word(s).
 *
 * String will never be empty and you do not need to account for different data types.
 */
public class ShortestWord {
    public static int findShort(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length).min().orElse(0);
    }
}
