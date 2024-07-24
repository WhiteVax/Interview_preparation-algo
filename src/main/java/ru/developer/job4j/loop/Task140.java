package ru.developer.job4j.loop;

/**
 * Написать код, который находит наибольший делитель этого числа, отличный от самого числа. Число 1 тоже
 * является делителем.
 */
public class Task140 {
    public static void loop(int num) {
        for(int i = num - 1; i > 0; i--) {
            if(num % i == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
