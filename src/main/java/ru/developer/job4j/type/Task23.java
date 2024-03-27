package ru.developer.job4j.type;

/**
 * Задание: Отделить цифры данного числа друг от друга и вывести их в консоль в одну строку через пробел в обратном порядке.
 * Например, для числа 205 вывод должен быть:
 * 5 0 2
 */
public class Task23 {
    public static void separate(int number) {
        int num1, num2, num3;
        System.out.print(number % 10 + " ");
        System.out.print(number / 10 % 10 + " ");
        System.out.print(number / 100 );
    }
}
