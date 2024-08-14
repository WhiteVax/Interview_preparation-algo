package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел делители входящего числа, являющиеся простыми числами.
 * Простое число - число, которое имеет только 2 делителя, то есть делится только на 1 и на себя.
 * Например, для числа 10 вывод будет:
 * 2 5
 */
public class Task165 {
    public static void loop(int num) {
        var joiner = new StringJoiner(" ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                int counter = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        counter++;
                    }
                }
                if (counter == 2) {
                    joiner.add(String.valueOf(i));
                }
            }
        }
        System.out.println(joiner);
    }
}
