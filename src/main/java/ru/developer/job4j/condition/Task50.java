package ru.developer.job4j.condition;

/**
 * Написать код, который выводит в консоль наибольшую из последних цифр этих двух чисел. Если последние цифры одинаковы,
 * то вывести - "Одинаковые".
 */
public class Task50 {
    public static void maxLastDigit(int num1, int num2) {
        num1 %= 10;
        num2 %= 10;
        if (num1 == num2) {
            System.out.println("Одинаковые");
        } else {
            int max;
            max = num1 > num2 ? num1 : num2;
            System.out.println(max);
        }
    }
}
