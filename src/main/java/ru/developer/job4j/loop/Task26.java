package ru.developer.job4j.loop;
import java.util.StringJoiner;

public class Task26 {
    public static void loop(int num) {
        num *= 2;
        int counter = 0;
        var joiner = new StringJoiner(" ");
        for (int i = 0; i < num; i++) {
            joiner.add(String.valueOf(counter));
            counter -= 8;
        }
        System.out.println(joiner);
    }
}
