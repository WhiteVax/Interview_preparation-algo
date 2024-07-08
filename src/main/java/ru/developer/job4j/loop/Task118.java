package ru.developer.job4j.loop;

/**
 * Ниже представлен метод loop(int num), который принимает целое положительное число.
 * Задание: Написать код, который выводит в консоль количество четных цифр и сумму нечетных цифр этого числа в виде:
 * "Количество чет: х, сумма нечет: у".
 * Например, для входящего числа 2235 вывод должен быть:
 * Количество чет: 2, сумма нечет: 8
 */
public class Task118 {
    public static void loop(int num) {
        int counter = 0;
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            if (temp % 2 == 0) {
                counter++;
            } else {
                sum += temp;
            }
            num /= 10;
        }
        System.out.printf("Количество чет: %d, сумма нечет: %d\n", counter, sum);
    }
}
