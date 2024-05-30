package ru.developer.job4j.condition;

/**
 * Написать код, который определяет, является ли двузначное число "внутренним" по отношению к четырехзначному.
 * То есть какая-то пара смежных цифр в четырехзначном числе образует входящее двузначное число.
 * Вывести в консоль "Да", если является, и "Нет", если не является.
 */
public class Task74 {
    public static void innerNum(int num2, int num4) {
       if (num2 == num4 % 100 || num2 == num4 / 100
       || num2 == num4 % 1000 / 10) {
           System.out.println("Да");
       } else {
           System.out.println("Нет");
       }
    }
}
