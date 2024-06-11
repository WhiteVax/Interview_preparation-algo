package ru.developer.codewars.cata_7;

public class SumOfTheFirstNthTermOfSeries {
    public static String seriesSum(int n) {
        double rsl = 0.0;
        for (int i = 0; i < n; i++) {
            rsl += 1.0 / (1 + 3 * i);
        }
        return String.format("%.2f", rsl);
    }
}
