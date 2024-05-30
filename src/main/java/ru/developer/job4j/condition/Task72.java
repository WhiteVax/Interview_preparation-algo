package ru.developer.job4j.condition;

/**
 *Написать код, который определяет, является ли средняя цифра этого числа больше остальных. Вывести в консоль "Да",
 * если является, и "Нет", если не является.
 */
public class Task72 {
    public static void midDigitMore(int num) {
        int first, second, third;
        first = num / 100;
        second = num / 10 % 10;
        third = num % 10;
        if (second > first && second > third) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
