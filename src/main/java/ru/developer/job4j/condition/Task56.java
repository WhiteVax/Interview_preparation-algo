package ru.developer.job4j.condition;

/**
 * Написать код, который проверяет, являются ли эти числа сторонами треугольника, то есть из них возможно составить треугольник.
 * Вывести в консоль "Да", если являются, или "Нет", если не являются.
 */
public class Task56 {
    public static void isTriangle(int a, int b, int c) {
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
