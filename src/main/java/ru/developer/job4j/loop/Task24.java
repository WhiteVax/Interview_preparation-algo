package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел 5 чисел, отвечающих следующим условиям:
 * - Серия начинается с числа, которое меньше входящего на 10.
 * - Каждое число в серии (начиная со второго) меньше предыдущего на 6.
 */
public class Task24 {
    public static void loop(int num) {
        var joiner = new StringJoiner(" ");
        int border = num - 10 - (6 * 4);
        num -= 10;
        for (int i = num; i >= border; i -= 6) {
            joiner.add(String.valueOf(i));
        }
        System.out.println(joiner);
    }
}
