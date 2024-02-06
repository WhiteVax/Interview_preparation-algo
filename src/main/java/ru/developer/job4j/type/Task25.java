package ru.developer.job4j.type;

/**
 * Задание: Вывести входящее число в консоль в одну строку в "полном виде", то есть в виде "сотни+десятки+единицы".
 * Например, для числа 345 вывод должен быть:
 * 300+40+5
 */
public class Task25 {
    public static void separate(int number) {
        System.out.println(number / 100 * 100 + "+" + number / 10 % 10 * 10 + "+" + number % 10);
    }
}
