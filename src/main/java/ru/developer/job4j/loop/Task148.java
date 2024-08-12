package ru.developer.job4j.loop;

/**
 * На прогулочном пароходе есть определенное количество мест для взрослых и для детей.
 * Ниже представлен метод loop(int children, int adults, int[] cNum, int[] aNum), который принимает
 * 2 целых положительных числа: children - количество мест на пароходе на детей, adults - количество мест на взрослых,
 * и 2 массива целых чисел: cNum - количество билетов для детей, aNum - количество билетов для взрослых,
 * которые покупает очередная группа. Продажа заканчивается, когда нет возможности выполнить очередной заказ (нет нужного количества свободных мест).
 * <p>
 * Задание: Написать код, который выводит в консоль следующую информацию:
 * - Число групп, купивших билеты (Группа - одинаковые индексы массивов. Т.е. Значения в нулевых индексах - одна группа,
 * в первых индексах - другая и т.д.).
 * - Количество взрослых и детей на пароходе.
 * - Количество непроданных взрослых и детских мест.
 * Результат вывести в виде "Группы: х, Взрослых: у, детей: z, осталось билетов взр: а, осталось билетов дет: b".
 * Например, для входящих значений 10, 10, [5, 2, 1, 4], [5, 5, 3, 2] вывод будет:
 * Группы: 2, Взрослых: 10, детей: 7, осталось билетов взр: 0, осталось билетов дет: 3
 */
public class Task148 {
    public static void loop(int children, int adults, int[] cNum, int[] aNum) {
        int childrenTick = children;
        int adultTic = adults;
        int groups = 0;
        for (int i = 0; i < cNum.length; i++) {
            if (childrenTick - cNum[i] >= 0 && adultTic - aNum[i] >= 0) {
                childrenTick -= cNum[i];
                adultTic -= aNum[i];
                groups++;
            }
        }
        System.out.printf("Группы: %d, Взрослых: %d, детей: %d, осталось билетов взр: %d, осталось билетов дет: %d\n",
                groups, adults - adultTic, children - childrenTick, adultTic, childrenTick);
    }
}