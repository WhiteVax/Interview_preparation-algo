package ru.developer.codewars.cata_7;

import java.util.stream.IntStream;

/**
 * Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including
 * them and return it. If the two numbers are equal return a or b.
 * Note: a and b are not ordered!
 * Examples (a, b) --> output (explanation)
 *
 * (1, 0) --> 1 (1 + 0 = 1)
 * (1, 2) --> 3 (1 + 2 = 3)
 * (0, 1) --> 1 (0 + 1 = 1)
 * (1, 1) --> 1 (1 since both are same)
 * (-1, 0) --> -1 (-1 + 0 = -1)
 * (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
 */
public class Beginner_Series_3_Sum_of_Numbers {
    public int GetSum(int a, int b) {
        return IntStream.range(Math.min(a, b), Math.max(a, b) + 1)
                .sum();
    }
}
