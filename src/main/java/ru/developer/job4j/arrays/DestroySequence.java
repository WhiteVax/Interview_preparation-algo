package ru.developer.job4j.arrays;

/**
 * Представьте, что вы связист. Вы поймали чей-то сигнал и хотите испортить его. Вы решили это сделать следующим образом,
 * заменить первые 5 символов 0, а последние 5 символов 1.
 *
 * Длина исходной последовательности >= 10
 */
public class DestroySequence {
    public static char[] destroy(char[] seq) {
        int first = 0;
        int last = seq.length - 1;
        for (int i = 0; i < 5; i++) {
            seq[first++] = '0';
            seq[last--] = '1';
        }
        return seq;
    }
}
