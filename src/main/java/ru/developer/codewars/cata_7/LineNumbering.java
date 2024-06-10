package ru.developer.codewars.cata_7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
 * Write a function which takes a list of strings and returns each line prepended by the correct number.
 * The numbering starts at 1. The format is n: string. Notice the colon and space in between.
 * Examples: (Input --> Output)
 * [] --> []
 * ["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
 */
public class LineNumbering {
    public static List<String> number(List<String> lines) {
        if (lines.isEmpty()) {
            return lines;
        }
        return IntStream.range(0, lines.size())
                .mapToObj(n -> String.format("%d: %s", n + 1, lines.get(n)))
                .collect(Collectors.toList());
    }
}
