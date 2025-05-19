package ru.developer.job4j.string;

/**
 * Найти максимально длинную последовательность символов, с которой начинаются все элементы массива.
 * Результат нужно вернуть в виде строки, либо вернуть пустую строку, если совпадений нет.
 * Например, при массиве [стол, стул, столица] метод maxMatch() вернёт "ст", а при массиве [дверь, стол] вернется пустая строка "".
 * Примечание: все символы в строках в массиве strings имеют нижний регистр.
 */
public class Task1 {
    public static String maxMatch(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        for (int i = 0; i < strings[0].length(); i++) {
            char c = strings[0].charAt(i);
            for (int j = 1; j < strings.length; j++) {
                if (i == strings[j].length() || c != strings[j].charAt(i)) {
                    return strings[0].substring(0, i);
                }
            }
        }
        return strings[0];
    }
}


