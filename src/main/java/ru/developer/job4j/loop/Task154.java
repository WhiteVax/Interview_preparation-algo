package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль построчно через пробел все делители чисел от 10 до 20 (оба включая)
 * в виде "Число: х, делители: у1 у2 ... уN".
 */
public class Task154 {
    public static void loop() {
        for (int i = 10; i <= 20; i++) {
            var joiner = new StringJoiner(" ");
            for (int j = 1; j <= 10; j++) {
                if (i % j == 0 && i != j) {
                    joiner.add(String.valueOf(j));
                }
            }
            System.out.printf("Число: %d, делитель: %s%n", i, joiner);
        }
    }
}
