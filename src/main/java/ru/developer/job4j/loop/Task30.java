package ru.developer.job4j.loop;

import java.util.StringJoiner;

public class Task30 {
    public static void loop(int num) {
       var joiner = new StringJoiner(" ");
        for (int i = 100; i < 130; i++) {
            if (i % 10 == num) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
