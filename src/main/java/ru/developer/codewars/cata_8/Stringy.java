package ru.developer.codewars.cata_8;

public class Stringy {
    public static String stringy(int size) {
        var builder = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            builder.append(i % 2 == 0 ? "0" : "1");
        }
        return builder.toString();
    }
}
