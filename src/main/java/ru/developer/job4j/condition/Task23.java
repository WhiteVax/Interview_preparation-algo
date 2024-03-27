package ru.developer.job4j.condition;

/**
 * Написать код, который выводит в консоль "Да", если дробь существует, иначе "Нет".
 */
public class Task23 {
    public static void isExist(int num1, int num2) {
        if (num2 != 0 && num1 / num2 % 1 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
