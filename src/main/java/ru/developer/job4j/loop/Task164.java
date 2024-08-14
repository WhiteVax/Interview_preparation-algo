package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел все положительные двузначные числа, квадрат которых не превышает 300.
 * Вывод должен получиться такой:
 * 10 11 12 13 14 15 16 17
 */
public class Task164 {
    public static void loop() {
        var joiner = new StringJoiner(" ");
        for (int i = 10; i < 20; i++) {
            if (i * i <= 300) {
                joiner.add(String.valueOf(i));
            } else {
                break;
            }
        }
        System.out.println(joiner);
    }
}
