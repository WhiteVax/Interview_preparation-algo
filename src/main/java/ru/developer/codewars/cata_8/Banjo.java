package ru.developer.codewars.cata_8;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        return name.matches("[Rr].*") ? name + " plays banjo" : name + " does not play banjo";
    }
}
