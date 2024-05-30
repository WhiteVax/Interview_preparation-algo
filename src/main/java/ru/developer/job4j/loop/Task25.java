package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел члены прогрессии в количестве равном входящему числу.
 */
public class Task25 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int step = 4;
        int size = 7 + step * num;
        for (int i = 7; i < size; i += step) {
            joiner.add(String.valueOf(i));
        }
        System.out.println(joiner);
    }
}
