package ru.developer.job4j.array;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел все значения массива таким образом:
 * в первой строке - значения из четных ячеек массива, а во второй строке - из нечетных.
 */
public class Task71 {
    public static void array(int[] arr) {
        var odd = new StringJoiner(" ");
        var even = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                odd.add(String.valueOf(arr[i]));
            } else {
                even.add(String.valueOf(arr[i]));
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
