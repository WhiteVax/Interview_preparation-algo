package ru.developer.job4j.loop;

/**
 * Написать код, который находит и сравнивает среднее арифметическое максимума и минимума этой серии чисел
 * со средним арифметическим всех значений серии. Вывести в консоль "Больше", если среднее арифметическое максимума
 * и минимума больше, чем среднее арифметическое всех значений, иначе вывести "Нет"
 * Например, для входящего массива значений [10, 8, 5, 4, 2] вывод должен быть:
 * Больше
 */
public class Task99 {
    public static void loop(int[] num) {
        int min = num[0];
        int max = num[0];
        int avg = 0;
        for (int i = 1; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
            if (max < num[i]) {
                max = num[i];
            }
            avg += num[i];
        }
        if ( avg / (num.length - 1) < (min + max) /2) {
            System.out.println("Больше");
        } else  {
            System.out.println("Меньше");
        }
    }
}
