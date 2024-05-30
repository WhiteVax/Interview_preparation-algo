package ru.developer.job4j.loop;
import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел все целые положительные трехзначные числа до 150,
 * сумма цифр которых равна входящему значению.
 * Например, для числа 5 вывод будет:
 * 104 113 122 131 140
 */
public class Task29 {
    public static void loop(int num) {
        var joiner = new StringJoiner(" ");
        for (int i = 100; i < 150; i++) {
            if (i / 100 + i / 10 % 10 + i % 10 == num) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
