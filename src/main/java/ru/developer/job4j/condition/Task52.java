package ru.developer.job4j.condition;

/**
 * Написать код, который проверяет, равны ли эти дроби друг другу, и выводит в консоль "Да", если равны, и "Нет", если не равны.
 */
public class Task52 {
    public static void isEquals(int a1, int a2, int b1, int b2) {
        if ((double) a1 / a2 == (double) b1 / b2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
