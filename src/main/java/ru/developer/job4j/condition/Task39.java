package ru.developer.job4j.condition;

/**
 * Написать код, который проверяет, является ли входящее число симметричным.
 * Если является - вывести "Да", если нет - "Нет".
 */
public class Task39 {
    public static void isSymmetric(int number) {
        int first, third;
        first = number / 100;
        third = number % 10;
        if (first == third) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
