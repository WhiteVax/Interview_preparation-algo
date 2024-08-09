package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который построчно выводит в консоль таблицу умножения. В первой строке - умножение 1-9 на 1,
 * во второй - на 2 и т.д. до умножения 1-9 на 9.
 */
public class Task151 {
    public static void loop() {
        for (int i = 1; i < 10; i++) {
            var joiner = new StringJoiner(" ");
            for (int j = 1; j < 10; j++) {
                joiner.add(String.valueOf(i * j));
            }
            System.out.print(joiner);
            System.out.println();
        }
    }
}
