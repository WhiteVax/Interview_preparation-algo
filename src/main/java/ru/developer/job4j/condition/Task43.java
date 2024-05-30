package ru.developer.job4j.condition;

/**
 * Написать код, который определяет, содержится ли в этом числе хотя бы один ноль, и выводит в консоль "Да",
 * если содержится или "Нет", если не содержится.
 */
public class Task43 {
    public static void containsZero(int number) {
        if (number / 100 == 0 || number / 10 % 10 == 0 || number % 10 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
