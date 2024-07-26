package ru.developer.job4j.loop;

/**
 * Написать код, который определяет и выводит в консоль наибольший общий делитель двух входящих чисел.
 * Например, для входящих чисел 15 и 50 вывод будет:
 */
public class Task143 {
    public static void loop(int num1, int num2) {
        while (num1 != num2) {
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            num1 -= num2;
        }
        System.out.println(num1);
    }
}
