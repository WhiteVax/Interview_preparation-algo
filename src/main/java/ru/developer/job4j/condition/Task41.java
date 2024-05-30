package ru.developer.job4j.condition;

/**
 * Написать код, который находит и выводит в консоль количество четных цифр в этом числе.
 */
public class Task41 {
    public static void evenDigitsAmount(int number) {
        int rsl = 0;
        rsl = number / 100  % 2 == 0 ? rsl + 1 : rsl;
        rsl = number % 100 / 10 % 2 == 0 ? rsl + 1 : rsl;
        rsl = number % 10 % 2 == 0 ? rsl + 1 : rsl;
        System.out.println(rsl);
    }
}
