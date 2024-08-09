package ru.developer.job4j.loop;

/**
 * Написать код, который выводит в консоль конечный остаток денег на счету клиента и количество успешно совершенных операций.
 * Работа с операциями завершается либо при превышении клиентом разрешенного овердрафта, либо при переводе нулевого значения.
 * Результат вывести в виде: "Остаток: х, операций: у".
 * Например, для входящих значений -100, 500, [-400, 200, 100, -1000] вывод должен быть:
 * Остаток: 400, операций: 3
 */
public class Task150 {
    public static void loop(int overdraft, int account, int[] transfers) {
        int i = 0;
        for(; overdraft < account && i < transfers.length; i++){
            if (transfers[i] == 0 || account + transfers[i] < overdraft) {
                break;
            }
            account += transfers[i];
        }
        System.out.printf("Остаток: %d, операций: %d\n", account, i);
    }
}
