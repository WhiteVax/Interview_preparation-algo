package ru.developer.job4j.loop;

/**
 * Написать код, который считает для каждого из входящих чисел: число цифр в числе, сумму цифр числа и число его делителей.
 * Результат вывести построчно в виде: "Цифр: х, сумма цифр: у, делителей: z". После этого вывести в отдельной строке
 * сумму всех цифр всех входящих чисел в виде: "Сумма всех цифр: х".
 * Например, для чисел 10, 5, 212 вывод будет:
 * Цифр: 2, сумма цифр: 1, делителей: 4
 * Цифр: 1, сумма цифр: 5, делителей: 2
 * Цифр: 3, сумма цифр: 5, делителей: 6
 * Сумма всех цифр: 11
 */
public class Task168 {
    public static void loop(int num1, int num2, int num3) {
        int[] array = new int[9];

        setSumNumbersAndCounterNum(array, num1, 0, 1); // 2 // 0 1
        setSumNumbersAndCounterNum(array, num2, 3, 4); // 5 // 3 4
        setSumNumbersAndCounterNum(array, num3, 6, 7); // 8 6 7

        setCounterDividers(num1, array, 2);
        setCounterDividers(num2, array, 5);
        setCounterDividers(num3, array, 8);

        int sumDividersAllNumbers = array[0] + array[3] + array[6];

        System.out.printf("Цифр: %d, сумма цифр: %d, делителей: %d%n", array[1], array[0], array[2]);
        System.out.printf("Цифр: %d, сумма цифр: %d, делителей: %d%n", array[4], array[3], array[5]);
        System.out.printf("Цифр: %d, сумма цифр: %d, делителей: %d%n", array[7], array[6], array[8]);

        System.out.printf("Сумма всех цифр: %d%n", sumDividersAllNumbers);
    }

    private static void setCounterDividers(int num, int[] array, int indexDiv) {
        for (int i = 1; i <= num; i++) {
            if ((num % i) == 0) {
                array[indexDiv]++;
            }
        }
    }

    private static void setSumNumbersAndCounterNum(int[] array, int num, int indexSum, int indexCounterNum) {
        int number = num;
        while (number > 0) {
            array[indexSum] += number % 10;
            number /= 10;
            array[indexCounterNum] += 1;
        }
    }
}