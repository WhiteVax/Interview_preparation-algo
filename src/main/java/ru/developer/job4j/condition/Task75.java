package ru.developer.job4j.condition;

/**
 * Написать код, который определяет и выводит в консоль количество раз, когда двузначное число фигурирует как
 * "внутреннее" по отношению к четырехзначному. То есть какая-то пара смежных цифр в четырехзначном числе образует
 * входящее двузначное число от 0 до 3 раз.
 *
 * Например, для чисел 33 и 3331 вывод будет:
 */
public class Task75 {
    public static void innerNum(int num2, int num4) {

        String main = String.valueOf(num4);
        String sub = String.valueOf(num2);

        int count = 0;
        int index = 0;
        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index++;
        }
        System.out.println(count);
    }
}
