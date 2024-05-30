package ru.developer.job4j.condition;

/**
 * Написать код, который производит следующие расчеты: если первое входящее число (num1) - четное, то вывести в консоль
 * произведение num1 и num2, а если нечетное, то вывести сумму чисел num1 и num3.
 */
public class Task48 {
    public static void changeNum(int num1, double num2, int num3) {
        if (num1 % 2 == 0) {
            System.out.println(num1 * num2);
        } else {
            System.out.println(num1 + num3);
        }
    }
}
