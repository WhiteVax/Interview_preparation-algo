package ru.developer.codewars.cata_6;

import java.util.stream.IntStream;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 * Note: If the number is a multiple of both 3 and 5, only count it once.
 */
public class MultiplesOf_3_Or_5 {
    public int solution(int number) {
        return IntStream.range(0, number)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .sum();
    }
}
