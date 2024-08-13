package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел все числа от 10 до 20 (оба включая), сумма делителей которых тоже является четным числом.
 * Вывод должен получиться такой:
 * <p>
 * 10 11 12 13 14 15 17 19 20
 */
public class Task163 {
    public static void loop() {
        var joiner = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum % 2 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
