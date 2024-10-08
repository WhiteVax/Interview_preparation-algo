package ru.developer.job4j.array;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел все значения массива таким образом: в первой строке - все четные значения,
 * содержащиеся в массиве, а во второй строке - все нечетные значения, содержащиеся в массиве.
 */
public class Task72 {
    public static void array(int[] arr) {
        var odd = new StringJoiner(" ");
        var even = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd.add(String.valueOf(arr[i]));
            } else {
                even.add(String.valueOf(arr[i]));
            }
        }
        if (odd.length()==0) {
            System.out.println(even);
        } else if (even.length()==0) {
            System.out.println(odd);
        } else {
            System.out.println(even);
            System.out.println(odd);
        }
    }
}
