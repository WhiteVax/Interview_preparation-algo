package ru.developer.job4j.condition;

/**
 * Написать код, который проверяет, является ли входящее число "дважды четным".
 * Если является - вывести "Да", если нет - "Нет".
 */
public class Task40 {
    public static void isDoubleEven(int number) {
        int rsl = 0;
        rsl += number / 100;
        rsl += number % 100 / 10;
        if (rsl % 2 == 0 && number % 10 % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
