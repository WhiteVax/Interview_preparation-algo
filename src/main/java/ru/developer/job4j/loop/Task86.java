package ru.developer.job4j.loop;
import java.util.StringJoiner;

/**
 * Назовем "стабильным" положительное двузначное число, которое при умножении на 2 дает такое число,
 * в котором сумма цифр равна сумме цифр во входящем числе до умножения.
 * Задание: Написать код, который выводит в консоль через пробел только стабильные числа входящего массива.
 * Если стабильных чисел в массиве нет, то вывести сообщение "Стабильных чисел нет".
 *
 * Например, для массива чисел [36, 39] (36 - стабильное, 39 - нет) вывод будет:
 * 36
 */
public class Task86 {
    public static void loop(int[] num) {
        var joiner = new StringJoiner(" ");
        for (int i : num) {
            if (getSum(i) == getSum(i * 2)) {
                joiner.add(String.valueOf(i));
            }
        }
        if (joiner.length() == 0) {
            System.out.println("Стабильных чисел нет");
        } else {
            System.out.println(joiner);
        }
    }

    private static int getSum(int num) {
        return (num / 10) + (num % 10);
    }

    public static void main(String[] args) {
        loop(new int[]{18, 27});
    }
}
