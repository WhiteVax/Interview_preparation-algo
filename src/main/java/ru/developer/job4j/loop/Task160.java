package ru.developer.job4j.loop;

/**
 * 2 положительных числа называются "дружественными" или "родственными", если сумма делителей числа а равна числу b,
 * а сумма делителей числа b равна числу а. Например, это числа 220 и 284, так как сумма делителей 220 равна 284,
 * а сумма делителей 284 равна 220.
 *
 * Задание: написать код, который ищет ближайшее к входящему четырехзначному числу num и большее него "родственное" число.
 */
public class Task160 {
    public static void loop(int num) {
        int numSumDiv = getSumDiv(num);
        int rsl = 0;
        for (int i = 1; i < num * 1.5; i++) {
            if (numSumDiv == i && getSumDiv(i) == num) {
                rsl = i;
                break;
            }
        }
        System.out.println(rsl);
    }

    private static int getSumDiv(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
