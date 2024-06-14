package ru.developer.codewars.cata_7;

import java.util.regex.Pattern;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aoeuiAEIOU]", "");
    }
}
