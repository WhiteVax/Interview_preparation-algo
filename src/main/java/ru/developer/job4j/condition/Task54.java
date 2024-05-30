package ru.developer.job4j.condition;

/**
 * Написать код, который выполняет следующее:
 * - Если число четное - все четные цифры этого числа увеличиваются на 1, а нечетные - уменьшаются на 1.
 * Если увеличение/уменьшение невозможно (например, увеличить 9), то оставить эту цифру без изменения.
 * - Если число нечетное, то все изменения произвести наоборот - четные цифры уменьшить на 1, нечетные - увеличить на 1.
 * <p>
 * Например, для числа 309 вывод будет:
 * <p>
 * 409
 */
public class Task54 {

    public static void transform(int number) {
        int minus = number < 0 ? -1 : 1;
        number *= minus;

        int[] numbers = new int[3];
        numbers[0] = number % 10;
        number /= 10;
        numbers[1] = number % 10;
        number /= 10;
        numbers[2] = number % 10;

        if (numbers[0] % 2 == 0) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    if (numbers[i] != 9) {
                        numbers[i]++;
                    }
                } else {
                    if (numbers[i] != 0) {
                        numbers[i]--;
                    }
                }
            }
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    if (numbers[i] != 0) {
                        numbers[i]--;
                    }
                } else {
                    if (numbers[i] != 9) {
                        numbers[i]++;
                    }
                }
            }
        }

        number = numbers[0] + numbers[1] * 10 + numbers[2] * 100;
        number *= minus;

        System.out.println(number);
    }
}
