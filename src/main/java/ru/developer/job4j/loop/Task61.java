package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль все трехзначные числа от 100 до 500, отвечающие следующему условию:
 * сумма квадратов первой и последней цифр должна быть равна квадрату средней цифры.
 */
public class Task61 {
    public static void loop() {
        var joiner = new StringJoiner(" ");
        int first, second, third;
        int square = 0;
        for (int i = 100; i < 500; i++) {
            first = i / 100;
            second = i / 10 % 10;
            third = i % 10;
            square = first * first + third * third;
            if (square == second * second) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
