package ru.developer.job4j.condition;

/**
 * Написать код, который определяет является ли это значение символом латинского алфавита. Вывести в консоль "Да",
 * если является, и "Нет", если не является.
 */
public class Task81 {
    public static void isLatin(char s) {
        System.out.println(s >= 'a' && s <= 'z'
                || s >= 'A' && s <= 'Z' ? "Да" : "Нет");
    }
}
