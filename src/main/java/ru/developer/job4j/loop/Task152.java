package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * написать код, который построчно выводит в консоль в первой строке все четные двузначные числа до 20 (включая),
 * во второй - двузначные числа до 20 (включая), делящиеся на 3 без остатка, а в третьей - двузначные числа до 20 (включая),
 * делящиеся на 4 без остатка.
 */
public class Task152 {
    public static void loop() {
        var sj2 = new StringJoiner(" ");
        var sj3 = new StringJoiner(" ");
        var sj4 = new StringJoiner(" ");

        for (int i = 10; i <= 20 ; i++) {
            if (i % 2 == 0) {
                sj2.add(String.valueOf(i));
            }
            if (i % 3 == 0) {
                sj3.add(String.valueOf(i));
            }
            if (i % 4 == 0) {
                sj4.add(String.valueOf(i));
            }
        }
        System.out.printf("%s%n%s%n%s%n", sj2, sj3, sj4);
    }
}
