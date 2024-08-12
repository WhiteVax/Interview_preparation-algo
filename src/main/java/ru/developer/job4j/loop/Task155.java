package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль построчно суммы всех делителей чисел от 10 до 20 (оба включая) в виде
 * "Число: х, сумма делителей: у".
 */
public class Task155 {
    public static void loop() {
        for (int i = 10; i <= 20 ; i++) {
            short sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            System.out.printf("Число: %d, сумма делителей: %d\n", i, sum);
        }
    }
}
