package ru.developer.job4j.type;

/**
 * Написать код, который выполняет "линейный сдвиг числа влево", то есть цифры числа перемещаются на одну позицию влево
 * (единицы - на место десятков, десятки - на место сотен и тд), при этом первая цифра удаляется из числа, а на место единиц записывается ноль.
 * Результат вывести в консоль.
 * Например, для числа 1234 вывод должен быть:
 * 2340
 */
public class Task38 {
    public static void leftShift(int number) {
        System.out.println(number % 1000 * 10);
    }
}
