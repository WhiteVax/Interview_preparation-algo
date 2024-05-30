package ru.developer.job4j.condition;

/**
 * Написать код, который выводит на экран сумму этих чисел, если первое больше второго, если же наоборот - выводит их произведение.
 * В случае, если числа одинаковы, вывести сообщение "Числа равны".
 */
public class Task19 {
    public static void sumOrMultiply(int number1, int number2) {
       if (number1 > number2) {
           System.out.println(number1 + number2);
       } else if (number1 < number2) {
           System.out.println(number1 * number2);
       } else {
           System.out.println("Числа равны");
       }
    }
}
