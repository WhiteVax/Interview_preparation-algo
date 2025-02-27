package ru.developer.algo;

/**
 * Данный алгоритм также известен под названием алгоритм Бойера-Мура-Хорспула. Процедура алгоритма очень простая.
 * Сначала строится таблица смещений для каждого символа. Затем исходная строка и шаблон совмещаются по началу,
 * сравнение ведется по последнему символу.
 * <p>
 * Если последние символы совпадают, то сравнение идет по предпоследнему символу и так далее. Если же символы не совпали,
 * то шаблон смещается вправо, на число позиций взятое из таблицы смещений для символа из исходной строки,
 * и тогда снова сравниваются последние символы исходной строки и шаблона.
 */
public class BoyerMooreHorspool {
    private static int[] buildLastOccurrenceTable(String pattern) {
        int[] lastOccurrence = new int[256];
        for (int i = 0; i < lastOccurrence.length; i++) {
            lastOccurrence[i] = -1;
        }
        for (int i = pattern.length() - 1; i >= 0; i--) {
            lastOccurrence[pattern.charAt(i)] = i;
        }
        return lastOccurrence;
    }

    public static int search(String text, String pattern) {
        int[] lastOccurrence = buildLastOccurrenceTable(pattern);
        int i = pattern.length() - 1;
        while (i < text.length()) {
            int j = pattern.length() - 1;
            System.out.println(i);
            while (j >= 0 && text.charAt(i - j) == pattern.charAt(j)) {
                j--;
            }
            if (j < 0) {
                return i - pattern.length() + 1;
            }
            i += lastOccurrence[text.charAt(i)];
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "abracadabra";
        String pattern = "abra";
        System.out.println("Старт");
        int index = search(text, pattern);
        if (index == -1) {
            System.out.println("Сообщение не найдено");
        } else {
            System.out.println("Вхождение найдено на позиции " + index);
        }
    }
}
