package ru.developer.job4j.type;

/**
 * Задание: Написать код, который выполняет перестановку первой и последней цифры входящего трехзначного числа,
 * и выводит результат в консоль.
 * Например, для числа 125 вывод должен быть:
 * 521
 */
public class Task35 {
    public static void firstLastChange(int number) {
        int num1, num2, num3;
        num1 = number % 10 * 100;
        num2 = number / 10 % 10 * 10;
        num3 = number / 100;
        System.out.println(num1 + num2 + num3);
    }
}
