package ru.developer.job4j.condition;

/**
 * Написать код, который проверяет, является ли дробь, состоящая из входящих чисел - правильной, неправильной
 * или же это целое число. Вывести в консоль тип получившейся дроби - "Правильная", "Неправильная" или "Целое число".
 */
public class Task51 {
    public static void fractionType(int num1, int num2) {
       if (num1 == num2) {
           System.out.println("Целое число");
       } else if (num1 < num2) {
           System.out.println("Правильная");
       } else {
           System.out.println("Неправильная");
       }
    }
}
