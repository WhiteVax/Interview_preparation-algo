package ru.developer.job4j.loop;

/**
 * Ниже представлен метод loop(int num), который принимает целое положительное число.
 * Задание: Написать код, который выводит в консоль количество четных цифр этого числа и их сумму в виде: "Количество: х, сумма: у".
 * Например, для входящего числа 223 вывод должен быть:
 * Количество: 2, сумма: 4
 */
public class Task117 {
    public static void loop(int num) {
        int counter = 0;
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            if (temp % 2 == 0) {
                counter++;
                sum += temp;
            }
            num /= 10;
        }
        System.out.printf("Количество: %d, сумма: %d\n", counter, sum);
    }
}
