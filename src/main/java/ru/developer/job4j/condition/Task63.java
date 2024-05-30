package ru.developer.job4j.condition;

/**
 * Написать код, который проверяет, располагаются ли цифры этого числа в порядке убывания (первая - наибольшая,
 * третья - наименьшая, все цифры разные), и выводит в консоль "Да", если располагаются, и "Нет", если не располагаются.
 */
public class Task63 {
    public static void isDecreasing(int number) {
        int first = number % 10;
        boolean result = true;
        number /= 10;

        while (number > 0) {
            result = first < number % 10;
            first = number % 10;
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
