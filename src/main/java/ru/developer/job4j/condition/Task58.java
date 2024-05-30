package ru.developer.job4j.condition;

/**
 * Написать код, который проверяет, является ли такой билет выигрышным, и выводит в консоль "Да", если является, и "Нет",
 * если не является.
 * 145505
 */
public class Task58 {
    public static void isWinning(int number) {
        int firstPart = number / 100000 + number / 10000 % 10 + number / 1000 % 10;
        int secondPart = number % 10 + number / 10 % 10 + number / 100 % 10;
        if (firstPart == secondPart) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

//    public static void isWinning(int number) {
//
//        int firstPart = sum(number / 1000);
//        int secondPart = sum(number % 1000);
//
//        if(firstPart == secondPart){
//            System.out.println("Да");
//        } else {
//            System.out.println("Нет");
//        }
//    }
//
//    private static int sum(int num){
//        int sum = 0;
//        while(num > 0){
//            sum += num % 10;
//            num /= 10;
//        }
//        return sum;
//    }
}
