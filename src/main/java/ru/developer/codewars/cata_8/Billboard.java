package ru.developer.codewars.cata_8;

/**
 * Without *
 */
public class Billboard {
    public static int billboard(String name, int price) {
        int rsl = 0;
        for (int i = 0; i < name.length(); i++) {
            rsl+=price;
        }
        return rsl;
    }
}
