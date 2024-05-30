package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел все целые положительные двузначные числа до 30,
 * сумма цифр которых равна входящему значению.
 */
public class Task28 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i <= 30; i++) {
            if (i / 10 + i % 10 == num) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
