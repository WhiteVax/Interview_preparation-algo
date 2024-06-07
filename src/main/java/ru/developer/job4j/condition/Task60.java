package ru.developer.job4j.condition;

/**
 * Написать код, который проверяет соотношение этих трех чисел с точки зрения значений (равны, больше, меньше).
 * Требуется вывести в консоль ответы на следующие ситуации:
 * - Если все числа равны между собой - вывести "Все равны".
 * - Если все числа не равны между собой - вывести "Равных нет".
 * - Если 2 числа равны и третье число больше них - вывести, например: "Первое и третье равны, второе больше" или "Первое и второе равны, третье больше".
 * - Если 2 числа равны и третье число меньше них - вывести, например: "Первое и третье равны, второе меньше" или "Второе и третье равны, первое меньше".
 * Например, для чисел 2, 3, 2 вывод будет:
 * Первое и третье равны, второе больше
 */
public class Task60 {
    public static void numRelation(int a, int b, int c) {
        if (a == b && a == c) {
            System.out.println("Все равны");
        } else if ((a != b && a != c) && (b != c && b != a)) {
            System.out.println("Равных нет");
        } else if (a == b && a < c) {
            System.out.println("Первое и второе равны, третье больше");
        } else if (a == c && a < b) {
            System.out.println("Первое и третье равны, второе больше");
        } else if (b == c && b < a) {
            System.out.println("Второе и третье равны, первое больше");
        } else if (a == b && a > c) {
            System.out.println("Первое и второе равны, третье меньше");
        } else if (a == c && a > b) {
            System.out.println("Первое и третье равны, второе меньше");
        } else if (b == c && b > a) {
            System.out.println("Второе и третье равны, первое меньше");
        }
    }
}