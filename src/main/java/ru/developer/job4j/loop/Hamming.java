package ru.developer.job4j.loop;

/**
 * Расстояние Хэмминга - это число позиций в которых соответствующие символы двух слов одинаковой длины различны.
 *
 */
public class Hamming {
    public static int checkStrings(String left, String right) {
        int counter = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}
