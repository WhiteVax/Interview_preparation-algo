package ru.developer.codewars.cata_8;

/**
 * Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.
 * Example:
 * n= 5, m=5: 25
 * n=-5, m=5:  0
 */
public class Paper {
    public static int paperWork(int n, int m) {
        return n + m > 0 ? n * m : 0;
    }
}
