package ru.developer.codewars.cata_7;

/**
 * You are given a string representing a number in binary. Your task is to delete all the unset bits in this string
 * and return the corresponding number (after keeping only the '1's).
 * eliminateUnsetBits("11010101010101") ->  255 (= 11111111)
 * eliminateUnsetBits("111") ->  7
 * eliminateUnsetBits("1000000") -> 1
 * eliminateUnsetBits("000") -> 0
 */
public class SetBits {
    public static long eliminateUnsetBits(String number) {
        return (1L << number.replaceAll("[0]", "").length()) - 1;
    }
}
