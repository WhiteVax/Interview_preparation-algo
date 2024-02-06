package ru.developer.job4j.type;

/**
 * Например, для числа 37 нужно построить число 73, и вывести на экран 81.
 */
public class Task26 {
    public static void transform(int number) {
        System.out.println(number % 10 * 10  + number / 10 + 8);
    }
}
