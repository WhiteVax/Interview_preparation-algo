package ru.developer.job4j.condition;

/**
 * Задание: Написать код, который проверяет, является ли входящее число симметричным (палиндромом),
 * и выводит в консоль "Да", если является, и "Нет", если не является.
 */
public class Task49 {
    public static void isPalindrome(int number) {
        boolean palindrome = true;
        String numberString = String.valueOf(number);
        for (int i = 0; i < numberString.length() / 2; i++) {
            if (numberString.charAt(i) != numberString.charAt(numberString.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("Да");
        } else  {
            System.out.println("Нет");
        }
    }
}
