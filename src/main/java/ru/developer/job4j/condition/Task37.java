package ru.developer.job4j.condition;

/**
 * Написать код, который проверяет, является ли первая цифра этого числа (десятки) больше второй (единицы).
 * Вывести в консоль "Да", если является, и "Нет", если не является.
 */
public class Task37 {
    public static void numsCompare(int number) {
        if (number / 10 > number % 10) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
