package ru.developer.job4j.type;

/**
 * Задание: Написать код, который высчитывает разницу между числом десятков (первая цифра) и числом единиц (вторая цифра)
 * входящего двузначного числа, и выводит результат в консоль.
 * Например, для числа 25 вывод должен быть:
 * 3
 */
public class Task30 {
    public static void difference(int number) {
        int first, second;
        first = number / 10;
        second = number % 10;
        System.out.println(Math.abs(first - second));
    }
}
