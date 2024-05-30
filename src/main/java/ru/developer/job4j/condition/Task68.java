package ru.developer.job4j.condition;

/**
 * Написать код, который проверяет, являются ли эти числа длинами одного и того же треугольника, и выводит в консоль "Да",
 * если являются, и "Нет", если не являются.
 */
public class Task68 {
    public static void isTriangle(int a, int b, int c) {
        boolean rsl = a + b > c && a + c > b && b + c > a;
        if (rsl) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
