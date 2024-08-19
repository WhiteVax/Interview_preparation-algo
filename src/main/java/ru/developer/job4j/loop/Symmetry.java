package ru.developer.job4j.loop;

/**
 * Метод принимает целочисленное значение. Необходимо проверить является ли оно симметричным или нет.
 * Симметричным считается число в котором цифры идущие по порядку в прямом и обратном порядке равны друг другу.
 * Например, 12321 - симметричное. 12345 - нет.
 */
public class Symmetry {
    public static boolean check(int i) {
        boolean rsl = true;
        var number = String.valueOf(i);
        for (int j = 0; j < number.length() / 2; j++) {
            if (number.charAt(j) != number.charAt(number.length() - 1 - j)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
