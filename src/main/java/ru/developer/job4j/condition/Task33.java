package ru.developer.job4j.condition;

/**
 * Написать код, который выводит в консоль квадрат этого числа, если оно отрицательное, иначе вывести "Ошибка".
 */
public class Task33 {
    public static void numSquare(int number) {
        if (number < 0) {
            System.out.println(Math.abs(number * number));
        } else {
            System.out.println("Ошибка");
        }
    }
}
