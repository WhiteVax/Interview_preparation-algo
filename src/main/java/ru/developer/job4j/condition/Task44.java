package ru.developer.job4j.condition;

/**
 * Написать код, который выводит в консоль ближайшее к данному "круглое число".
 * <p>
 * Например, для введенного числа 553 выводится 550, а для 78 выводится 80.
 */
public class Task44 {
    public static void getRoundNumber(int number) {
        int remainder = number % 10;
        remainder = remainder >= 5 ? 10 : 0;
        number = number / 10 * 10;
        System.out.println(remainder + number);
    }
}
