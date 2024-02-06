package ru.developer.job4j.type;

/**
 * Задание: Вывести входящее число в консоль в одну строку в "полном виде",
 * то есть в виде "десятки+единицы".
 * Например, для числа 34 вывод должен быть:
 * 30+4
 */
public class Task24 {
    public static void separate(int number) {
        System.out.println(number / 10 * 10 + "+" + number % 10);
    }
}