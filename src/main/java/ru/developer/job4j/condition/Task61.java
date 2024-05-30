package ru.developer.job4j.condition;

/**
 * Написать код, который проверяет, состоит ли это число из одинаковых цифр, и выводит в консоль "Да", если состоит,
 * и "Нет", если не состоит.
 */
public class Task61 {
    public static void hasEqualDigits(int number) {
        int first = number % 10;
        boolean result = true;

        while (number > 0) {
            result = (first == number % 10);
            if (!result) {
                break;
            }
            number /= 10;
        }

        if (result) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
