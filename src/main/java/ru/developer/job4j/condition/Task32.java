package ru.developer.job4j.condition;

/**
 * Написать код, который выводит в консоль разницу между первым и вторым числом, если первое больше второго,
 * разницу между вторым и первым числом, если второе больше первого или произведение этих чисел, если они равны.
 * Например, для чисел 2 и 5 вывод будет:
 * 3
 */
public class Task32 {
    public static void calculate(int num1, int num2) {

        if (num1 < num2) {
            System.out.println(num2 - num1);
        } else if(num1 > num2) {
            System.out.println(num1 - num2);
        } else {
            System.out.println(3 * 3);
        }
    }
}
