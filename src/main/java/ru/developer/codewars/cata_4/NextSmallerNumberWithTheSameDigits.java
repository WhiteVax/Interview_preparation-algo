package ru.developer.codewars.cata_4;

import java.util.Arrays;

/**
 * Write a function that takes a positive integer and returns the next smaller positive integer containing the same digits.
 * For example:
 * nextSmaller(21) == 12
 * nextSmaller(531) == 513
 * nextSmaller(2071) == 2017
 */
public class NextSmallerNumberWithTheSameDigits {
    public static long nextSmaller(long n) {
        String numberStr = Long.toString(n);
        char[] digits = numberStr.toCharArray();

        int i = digits.length - 2;
        while (i >= 0 && digits[i] <= digits[i + 1]) {
            i--;
        }

        if (i == -1) {
            return -1;
        }

        int j = digits.length - 1;
        while (digits[j] >= digits[i]) {
            j--;
        }

        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        Arrays.sort(digits, i + 1, digits.length);
        for (int k = i + 1, l = digits.length - 1; k < l; k++, l--) {
            char tmp = digits[k];
            digits[k] = digits[l];
            digits[l] = tmp;
        }

        long result = Long.parseLong(new String(digits));
        if (digits.length != String.valueOf(result).length()) {
            return -1;
        }
        return result;
    }

}
