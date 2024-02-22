package ru.developer.job4j.condition;

/**
 * Написать код, который проверяет является ли число "четно-красивым". Если да - вывести в консоль слово "Да", иначе - "Нет".
 */
public class Task20 {
    public static void numCheck(int number) {
        if (number / 100 % 2 == 0 && number % 100 / 10 % 2 == 0
                && number % 10 % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
