package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел все целые положительные трехзначные числа до 130,
 * соответствующие следующему требованию: произведение первой и последней цифр равно квадрату средней.
 */
public class Task36 {
    public static void loop() {
        var joiner = new StringJoiner(" ");
        int first, second, third;
        for (int i = 100; i < 130; i++) {
            first = i / 100;
            second = i / 10 % 10;
            third = i % 10;
            if (first * third == second * second) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
