package ru.developer.job4j.array;

import java.util.StringJoiner;

/**
 * Дан массив слов, необходимо получить текст из этих слов, разделенных пробелом.
 * Например,
 * {"one", "two", "three"} => "one two three"
 */
public class WordsToText {
    public static String convert(String[] words) {
        var joiner = new StringJoiner(" ");
        for (String word : words) {
            joiner.add(word);
        }
        return joiner.toString();
    }
}
