package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел все простые трехзначные числа до 150.
 * Вывод должен получиться такой:
 * 101 103 107 109 113 127 131 137 139 149
 */
public class Task162 {
    public static void loop() {
        var joiner = new StringJoiner(" ");
        for (int i = 100; i < 150 ; i++) {
            boolean isSimpler = false;
            for (int j = 2; j < i; j++) {
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
