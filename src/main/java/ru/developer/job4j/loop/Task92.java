package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел все члены этой арифметической прогрессии, расположенные
 * между двумя входящими членами. Если входящие члены являются соседними, вывести "Нет чисел".
 */
public class Task92 {
    public static void loop(int a1, int n1, int a2, int n2) {
        int difference = (a2 - a1) / (n2 - n1);
        if (Math.abs(n2 - n1) == 1) {
            System.out.println("Нет чисел");
            return;
        }

        var joiner = new StringJoiner(" ");
        int number = a1;
        for (int i = n1; i < n2 - 1; i++) {
            number += difference;
            joiner.add(String.valueOf(number));
        }
        System.out.println(joiner);
    }
}
