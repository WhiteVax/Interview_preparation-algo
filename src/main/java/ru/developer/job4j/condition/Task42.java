package ru.developer.job4j.condition;

/**
 * Написать код, который определяет, является ли входящее число "парно-симметричным", и выводит в консоль "Да",
 * если является или "Нет", если не является.
 */
public class Task42 {
    public static void isPairSymmetric(int number) {
        int first, second;
        first = number / 100;
        second = number % 100;
        if (first == second) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
