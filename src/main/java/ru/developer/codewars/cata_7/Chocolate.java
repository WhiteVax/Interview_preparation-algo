package ru.developer.codewars.cata_7;

public class Chocolate {
    public static long breakChocolate(long n, long m) {
        if (n + m < 2) {
            return 0;
        }
        return n * m - 1;
    }
}
