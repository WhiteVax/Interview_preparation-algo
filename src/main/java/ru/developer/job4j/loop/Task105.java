package ru.developer.job4j.loop;

/**
 * Ниже представлен метод loop(int[] num), который принимает массив целых положительных трехзначных чисел.
 * Задание: Написать код, который находит и выводит в консоль индекс числа с максимальной суммой цифр.
 * Например, для входящего массива значений [194, 333, 562] вывод должен быть:
 * <p>
 * 0
 */
public class Task105 {

    public static void loop(int[] num) {
        int index = 0;
        int max = getSum(num[0]);
        for (int i = 1; i < num.length ; i++) {
            if (max < getSum(num[i])) {
                max = getSum(num[i]);
                index = i;
            }
        }
        System.out.println(index);
    }

    private static int getSum(int num) {
        return num / 100 + num / 10 % 10 + num % 10;
    }

//    private static int getSum(int num){
//        int sum = 0;
//        while(num > 0){
//            sum += num % 10;
//            num /= 10;
//        }
//        return sum;
//    }
}
