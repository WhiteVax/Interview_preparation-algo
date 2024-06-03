package ru.developer.codewars.cata_8;

/**
 * Complete the square sum function so that it squares each number passed into it and then sums the results together.
 *
 * For example, for [1, 2, 2] it should return 9 because 12+22+22=91^2 + 2^2 + 2^2 = 912+22+22=9.
 */
public class SquareSum {
    public static int squareSum(int[] n) {
        int rsl = 0;
        for (var number : n) {
            rsl += number * number;
        }
        return rsl;
    }
}
