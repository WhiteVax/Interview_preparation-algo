package ru.developer.job4j.condition;

/**
 * Написать код, который проверяет соответствие входящих значений, и выводит в консоль "Лишних стульев: n",
 * если стульев больше, чем учеников, выводит "Не хватает стульев: n", если учеников больше, чем стульев, либо выводит
 * "Соответствует", если числа равны. n - количество стульев.
 */
public class Task34 {
    public static void chairsCheck(int pupils, int chairs) {
        if (pupils == chairs) {
            System.out.println("Соответствует");
        } else if (pupils < chairs) {
            System.out.printf("Лишних стульев: %s\n", chairs-pupils);
        } else {
            System.out.printf("Не хватает стульев: %s\n", pupils - chairs);
        }
    }
}
