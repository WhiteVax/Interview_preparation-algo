package ru.developer.job4j.condition;

/**
 * Написать код, который выводит в консоль "Да", если число положительное, иначе "Нет".
 */
public class Task25 {
    public static void isPositive(int number) {
        if (number > 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
