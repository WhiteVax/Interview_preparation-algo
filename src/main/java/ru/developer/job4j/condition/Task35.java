package ru.developer.job4j.condition;

/**
 * Написать код, который проверяет, является ли входящее число реальной оценкой, то есть находится в диапазоне от 1 до 5.
 * Вывести в консоль "Да", если является, и "Нет", если не является.
 */
public class Task35 {
    public static void gradeCheck(int grade) {
        if (grade < 6 && grade > 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
