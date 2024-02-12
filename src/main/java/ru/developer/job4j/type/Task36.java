package ru.developer.job4j.type;

/**
 * Написать код, который выполняет перестановку первой и последней цифры входящего четырехзначного числа, и выводит результат в консоль.
 * Переменные first, middle и last - первая цифра, средняя секция цифр и последняя цифра соответственно.
 * Например, для числа 4265 вывод должен быть:
 * 5264
 */
public class Task36 {
    public static void firstLastChange(int number) {
        int first, middle, last;
        first = number % 10 * 1000;
        middle = number % 1000 / 10 * 10;
        last = number / 1000;
        System.out.println(first + middle + last);
    }
}
