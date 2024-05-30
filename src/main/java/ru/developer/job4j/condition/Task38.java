package ru.developer.job4j.condition;

/**
 * Написать код, который выводит на консоль наибольшую из цифр этого числа.
 * Если цифры равны - вывести "Равны".
 */
public class Task38 {
    public static void maxDigit(int number) {
        int first, second;
        first = number / 10;
        second = number % 10;
        if (first == second) {
            System.out.println("Равны");
        } else {
            System.out.println(Math.max(first, second));
        }
    }
}
