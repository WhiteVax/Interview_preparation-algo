package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел все числа до 10000, у которых сумма делителей
 * (включая 1, но не включая само число) равна самому числу.
 * Вывод должен быть такой:
 * 1 6 28 496 8128
 */
public class Task157 {
    public static void loop() {
        var joiner = new StringJoiner(" ");
        joiner.add(String.valueOf(1));
        for (int i = 1; i < 10000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
