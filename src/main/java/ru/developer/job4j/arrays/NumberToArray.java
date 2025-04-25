package ru.developer.job4j.arrays;

import java.util.Arrays;

/**
 * Дано число int. Нужно получить массив из его цифр в обратном порядке.
 * Например
 * 12345 => {5, 4, 3, 2, 1}
 */
public class NumberToArray {
    public static int[] resolve(int number) {
        String numberStr = new StringBuilder(String.valueOf(number)).reverse().toString();
        int[] result = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            result[i] = numberStr.charAt(i) - '0';
        }
       return result;
    }
}
