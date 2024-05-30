package ru.developer.job4j.loop;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел все положительные трехзначные числа в диапазоне
 * от второго числа (включая) до первого числа (не включая) в убывающем порядке. Перед началом вывода нужно
 * вывести слово "Старт" в отдельной строке, а после окончания вывода чисел - слово "Финиш", тоже в отдельной строке.
 */
public class Task15 {
    public static void loop(int a, int b) {
        System.out.println("Старт");
        var joiner = new StringJoiner(" ");
        while (b > 99 && a < b) {
            joiner.add(String.valueOf(b));
            b--;
        }
        System.out.println(joiner);
        System.out.println("Финиш");
    }
}
