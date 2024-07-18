package ru.developer.job4j.loop;

/**
 *  Написать код, который определяет и выводит в консоль наибольшее значение серии 1^2 + 2^2 + 3^2...,
 *  сумма которой не превышает num.
 *
 * Например, для числа 33 вывод должен быть (1^2 + 2^2 + 3^2 + 4^2):
 * 30
 */
public class Task134 {
    public static void loop(int num) {
        int sum = 0;
        for(int i = 1; i <= num; i++){
            int squre = i * i;
            if(sum + squre > num){
                break;
            }
            sum += squre;
        }
        System.out.println(sum);
    }
}
