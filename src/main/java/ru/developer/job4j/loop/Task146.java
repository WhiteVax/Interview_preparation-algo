package ru.developer.job4j.loop;

/**
 * В инструкции по пользованию лифтом в торговом центре написано: "Не более 4 человек или не более 300 кг".
 * Перед входом в лифт установлен прибор, который подсчитывает входящих в лифт и определяет вес до входа в лифт.
 * Прибор автоматически прекращает доступ к лифту, если вход очередного человека может нарушить инструкцию.
 * <p>
 * Написать код, который соблюдает требования, написанные в инструкции, то есть выводит в консоль количество людей,
 * вошедших в лифт, их общий вес и причину, по которой прекращен вход людей в лифт (если был прекращен).
 * Результат вывести в виде: "Людей: х, вес: у, отказ: z", где х - количество людей в лифте, у - общий вес людей,
 * z - одно из сообщений об отказе: "Перегруз", "Много людей", "Много людей и перегруз" или "Нет", если количество
 * и вес всех людей соответствует инструкции.
 * Например, для массива входящих значений [60, 80, 80, 70, 65] вывод будет:
 * Людей: 4, вес: 290, отказ: Много людей и веса
 * или при массиве входящих значений [60, 80, 80] вывод будет:
 * Людей: 3, вес: 220, отказ: Нет
 */
public class Task146 {
    public static void loop(int[] nums) {
        int count = 0;
        int sum = 0;
        int rslWeight = 0;
        for (int i = 0; i < nums.length; i++) {
            rslWeight = sum + nums[i];
            if (rslWeight <= 300 && count < 4) {
                sum = rslWeight;
                count++;
            } else {
                break;
            }
        }
        String message = "Нет";

        if (nums.length > 4 && rslWeight > 300) {
            message = "Много людей и перегруз";
        } else if (nums.length > 4) {
            message = "Много людей";
        } else if (rslWeight > 300) {
            message = "Перегруз";
        }

        System.out.printf("Людей: %d, вес: %d, отказ: %s%n", count, sum, message);
    }
}
