package ru.developer.job4j.loop;

/**
 * Написать код, который определяет и выводит в консоль наибольший общий делитель двух входящих чисел по алгоритму Евклида.
 * Например, для входящих чисел 12 и 40 вывод будет:
 * 4
 */
public class Task144 {
    public static void loop(int num1, int num2) {
        while (num1 !=0 && num2 !=0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
        System.out.println(num1 > num2 ? num1 : num2);
    }
}
