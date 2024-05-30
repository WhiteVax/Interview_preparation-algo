package ru.developer.job4j.condition;

/**
 Написать код, который определяет, является ли средняя цифра этого числа меньше остальных.
 Вывести в консоль "Да", если является, и "Нет", если не является.
 */
public class Task73 {
    public static void midDigitLess(int num) {
        int first, second, third;
        first = num / 100;
        second = num / 10 % 10;
        third = num % 10;
        if (second < first && second < third) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
