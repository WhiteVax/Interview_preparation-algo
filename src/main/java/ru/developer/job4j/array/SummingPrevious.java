package ru.developer.job4j.array;

/**
 * Даны целые числа n (> 2), a и b. Сформировать и вывести целочисленный массив размера n, первый элемент которого равен a,
 * второй равен b, а каждый последующий элемент равен сумме всех предыдущих.
 */
public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        for (int i = 2; i < n; i++) {
            int temp = 0;
            for (int j = 0; j <= i; j++) {
                temp += array[j];
            }
            array[i] = temp;
        }
        return array;
    }
}
