package ru.developer.codewars.cata_8;

public class StringToNumber {
    public static int stringToNumber(String str) {
        int rsl = -1;
        if (!str.isEmpty()) {
            rsl = Integer.parseInt(str);
        }
        return rsl;
    }
}
