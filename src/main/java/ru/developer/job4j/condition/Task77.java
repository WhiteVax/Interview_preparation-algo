package ru.developer.job4j.condition;

/**
 * Написать код, который определяет и выводит в консоль количество разных цифр в этом числе.
 *
 * Например, для числа 225 вывод будет:
 * 2
 */
public class Task77 {
    public static void diffNumAmount(int num) {
        int count = 0;
        int first = num % 10;
        num /= 10;
        int second = num % 10;
        int third = num / 10;

        if(first != second){
            count++;
        }
        if(first != third){
            count++;
        }
        if(second != third){
            count++;
        }
        System.out.println(count);
    }
}
