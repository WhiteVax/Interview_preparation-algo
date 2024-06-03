package ru.developer.codewars.cata_8;

public class DoubleChar {
    public static String doubleChar(String s){
        var builder = new StringBuilder();
        for (char ch: s.toCharArray()) {
                builder.append(ch);
                builder.append(ch);
        }
        return builder.toString();
    }
}
