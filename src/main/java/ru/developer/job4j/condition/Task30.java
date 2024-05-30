package ru.developer.job4j.condition;

/**
 * Написать код, который делает следующее:
 * - Если число отрицательное, превращает его в положительное.
 * - Если число положительное, превращает его в ноль.
 * - Если ноль, то оставить без изменений.
 */
public class Task30 {
    public static void numModify(int number) {
        if (number >= 0) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(number));
        }
    }
}
