package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который находит и выводит в консоль через пробел все трехзначные числа Армстронга,
 * а также их количество.
 */
public class Task89 {
    public static void loop() {
        int counter = 0;
        var joiner = new StringJoiner(" ");
        for (int i = 100; i < 1000; i++) {
            int first = i / 100;
            int second = i /10 % 10;
            int third = i % 10;
            if (first * first * first + second * second * second + third * third * third == i) {
                joiner.add(String.valueOf(i));
                counter++;
            }
        }
        System.out.printf("Числа: %s, Количество: %d\n", joiner, counter);
    }

    public static void main(String[] args) {
        loop();
    }
}
