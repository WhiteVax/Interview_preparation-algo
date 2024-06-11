package ru.developer.codewars.cata_7;

import java.util.Arrays;

/**
 * Task:
 * Given a list of integers, determine whether the sum of its elements is odd or even.
 * Give your answer as a string matching "odd" or "even".
 * If the input array is empty consider it as: [0] (array with a zero).
 * Input: [0]
 * Output: "even"
 * Input: [0, 1, 4]
 * Output: "odd"
 */
public class OddOrEven {
    private static String EVEN = "even";
    private static String ODD = "odd";

    public static String oddOrEven (int[] array) {
       int sum = Arrays.stream(array).sum();
       return sum % 2 == 0 ? EVEN : ODD;
    }
}
