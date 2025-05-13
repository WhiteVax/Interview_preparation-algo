package ru.developer.job4j.arrays;

import java.util.Arrays;

/**
 * В итоговом массиве символов должны остаться только буквы в ВЕРХНЕМ РЕГИСТРЕ, которые ранее в исходном были в нижнем.
 *     Например, для a-123-B, получить A.
 *     Например, для aLpha - 1-0!@#$5(2 пробела присутствуют), получить APHA.
 *     Например, для aLpHa - 1-0!@#$5(2 пробела присутствуют и 2 буквы в ВЕРХНЕМ регистре изначально), получить APA.
 */
public class UpperCaseSecond {
    public static char[] onlyLowCase(char[] input) {
        int count = 0;
        char[] output = new char[input.length];
        for (char c : input) {
            if (Character.isLowerCase(c)) {
                output[count++] = Character.toUpperCase(c);
            }
        }
        return Arrays.copyOf(output, count);
    }
}
