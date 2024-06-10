package ru.developer.codewars.cata_7;

import java.text.DecimalFormat;

public class DecimalTimeConversion {
    public static final DecimalFormat MINUTES = new DecimalFormat("00");
    public static double toIndustrial(String time) {
        String[] array = time.split(":");
        return Double.parseDouble(array[0]) + Math.round((Double.parseDouble(array[1]) / 60.0) * 100.0) / 100.0;
    }

    public static double toIndustrial(int time) {
        return Math.round((time / 60.0) * 100.0) / 100.0;
    }

    public static String toNormal(double time) {
        return "%d:%s".formatted(
                (int) time,
                MINUTES.format(Math.round(time % 1 * 60))
        );
    }
}
