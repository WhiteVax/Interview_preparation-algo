package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел все положительные трехзначные числа до 300 (включая),
 * для которых соблюдаются 2 условия: само число заканчивается на 0 и сумма нечетных делителей этого числа тоже заканчивается на 0.
 */
public class Task166 {
    public static void loop() {
        var joiner = new StringJoiner(" ");
        for (int i = 100; i <= 300; i++) {
            if (i % 10 == 0) {
                int temp = getSumDividers(i);
                if (temp % 10 == 0 ) {
                    joiner.add(String.valueOf(i));
                }
            }
        }
        System.out.println(joiner);
    }

    private static int getSumDividers(final int num) {
        int sum = 0;
        for (int i = 1; i < num; i+=2) {
            if (num % i == 0) {
                    sum += i;
            }
        }
        return sum;
    }
}
