package ru.developer.job4j.condition;

/**
 * Написать код, который проверяет, располагаются ли цифры этого числа в порядке возрастания (первая - наименьшая,
 * третья - наибольшая, все цифры разные), и выводит в консоль "Да", если располагаются, и "Нет", если не располагаются.
 */
public class Task62 {
    public static void isRising(int number) {
        int first, second, third;
        first = number / 100;
        second = number % 100 / 10;
        third = number % 10;
        if (first < second && second < third) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
