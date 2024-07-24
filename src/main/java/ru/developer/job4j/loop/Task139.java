package ru.developer.job4j.loop;

/**
 * Написать код, который находит наименьший делитель этого числа, отличный от 1. Само число тоже является
 * делителем.
 */
public class Task139 {
    public static void loop(int num) {
        for(int i = 2; i <= num; i++) {
            if(num % i == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
