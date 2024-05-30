package ru.developer.job4j.condition;

/**
 * Написать код, который определяет и выводит в консоль количество одинаковых цифр в этом числе.
 */
public class Task76 {
    public static void sameNumAmount(int num) {
        int rsl = 1;

        int first, second, third;
        first = num / 100;
        second = num % 100 / 10;
        third = num % 10;

        if (first != second && first != third && second != third) {
            rsl = 0;
        } else if (first == third && second == third) {
            rsl = 3;
        } else {
            rsl += (first == second) ? 1 : 0;
            rsl += (first == third) ? 1 : 0;
            rsl += (second == third) ? 1 : 0;
        }
        System.out.println(rsl);
    }
}
