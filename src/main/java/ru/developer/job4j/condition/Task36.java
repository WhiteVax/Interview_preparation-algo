package ru.developer.job4j.condition;

/**
 *Написать код, который проверяет, состоит ли это число из одинаковых цифр. Вывести в консоль "Да", если состоит, и "Нет",
 * если не состоит.
 */
public class Task36 {
    public static void sameNums(int number) {
       if (number % 10 == number / 10) {
           System.out.println("Да");
       } else {
           System.out.println("Нет");
       }
    }
}
