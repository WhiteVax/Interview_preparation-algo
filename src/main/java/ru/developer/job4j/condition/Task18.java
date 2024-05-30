package ru.developer.job4j.condition;

/**
 * Написать код, который уменьшает число на единицу, если оно как минимум трехзначное и положительное. Результат вывести в консоль.
 * Если число не проходит по условию, то вывести это же число без изменений.
 */
public class Task18 {
    public static void numDecrease(int number) {
        number = number > 0 && number / 100 > 0 ? number - 1 : number;
        System.out.println(number);
    }
}
