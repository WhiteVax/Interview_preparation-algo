package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел все простые двузначные числа до 30.
 * Вывод должен получиться такой:
 *
 * 11 13 17 19 23 29
 */
public class Task161 {
    public static void loop() {
        var joiner = new StringJoiner(" ");
        for (int i = 11; i < 30 ; i++) {
            boolean isSimpler = false;
            for (int j = 2; j < 10; j++) {
                if (i % j == 0) {
                    isSimpler = true;
                    break;
                }
            }
            if (isSimpler) {
                continue;
            }
            joiner.add(String.valueOf(i));
        }
        System.out.println(joiner);
    }
}
