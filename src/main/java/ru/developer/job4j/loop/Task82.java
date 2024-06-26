package ru.developer.job4j.loop;

/**
 * Ниже представлен метод loop(int[] promo, int[] concert), который принимает 2 массива целых положительных чисел.
 * На распродаже продаются 2 типа билетов: обычный билет и билет с посещением концерта. Существует акция:
 * при покупке 10 обычных билетов дополнительно дается еще один такой же обычный билет.
 * Соответственно, при покупке 20 - 2 билета и т.д.
 *
 * Задание: Написать код, который подсчитывает общее число проданных билетов на распродаже, а также число обычных
 * билетов одним покупателем, выданных бесплатно. Результат вывести в консоль в виде: "Продано билетов: х,
 * выдано бесплатно: y", где х и у - результаты вычислений.
 *
 * Входящий массив promo - количество купленных обычных билетов каждым участником, concert - количество купленных
 * каждым участником билетов с посещением концерта.
 *
 * Например, для входящих массивов со значениями [21, 10, 2, 2] и [1, 2, 5, 22] вывод должен быть:
 *
 * Продано билетов: 65, выдано бесплатно: 3
 */
public class Task82 {
    public static void loop(int[] promo, int[] concert) {
        int tickets = 0;
        int freeTickets = 0;
        for(int i = 0; i < promo.length; i++) {
            tickets += promo[i] + concert[i];
            freeTickets += promo[i] / 10;
        }
        System.out.printf("Продано билетов: %d, выдано бесплатно: %d\n", tickets, freeTickets);
    }
}
