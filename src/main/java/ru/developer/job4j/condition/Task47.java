package ru.developer.job4j.condition;

/**
 * Написать код, который изменяет это число следующим образом:
 * - Для чисел, больших 500, переставляет местами числа единиц и сотен (вместо 347 - 743).
 * - В остальных числах переставляются местами числа десятков и единиц (вместо 474 - 447).
 */
public class Task47 {
    public static void changeNum(int number) {
        if (500 < number) {
            number = (number % 10 * 100) + number % 100 / 10 * 10 + number / 100;
            System.out.println(number);
        } else {
            number = number - number % 100 + number % 100 / 10 + number % 10 * 10;
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        System.out.println(523 % 100);
    }
}
