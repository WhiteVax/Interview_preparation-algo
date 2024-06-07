package ru.developer.codewars.cata_7;

/**
 * Monday --> 12
 * Tuesday --> numbers greater than 95
 * Wednesday --> 34
 * Thursday --> 0
 * Friday --> numbers divisible by 2
 * Saturday --> 56
 * Sunday --> 666 or -666
 */
public class Arithmophobia {
    static public boolean AmIAfraid(final String day, final int num) {
        return switch (day) {
            case "Monday" -> num == 12;
            case "Tuesday" -> num > 95;
            case "Wednesday" -> num == 34;
            case "Thursday" -> num == 0;
            case "Friday" -> num % 2 == 0;
            case "Saturday" -> num == 56;
            case "Sunday" -> Math.abs(num) == 666;
            default -> throw new IllegalArgumentException("Unknown day!");
        };
    }
}
