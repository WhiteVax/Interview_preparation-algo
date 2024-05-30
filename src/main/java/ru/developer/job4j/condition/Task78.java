package ru.developer.job4j.condition;

import java.util.StringJoiner;

/**
 * Написать код, который определяет и выводит в консоль, на какие числа из составляющих входящее число цифр оно делится
 * без остатка. Если таких чисел несколько, то вывести полученные значения через пробел.
 * Если таких чисел нет - вывести "Таких чисел нет".
 */
public class Task78 {
    public static void divWithoutRemainder(int num) {
        var joiner = new StringJoiner(" ");
        int first = num / 100;
        int second = num % 100 / 10;
        int third = num % 10;

        if (first != 0 && num % first == 0) {
            joiner.add(String.valueOf(first));
        }

        if (second != 0 && num % second == 0) {
            joiner.add(String.valueOf(second));
        }

        if (third != 0 && num % third == 0) {
            joiner.add(String.valueOf(third));
        }

        if (joiner.length() == 0) {
            System.out.println("Таких чисел нет");
        } else {
            System.out.println(joiner);
        }
    }
}
